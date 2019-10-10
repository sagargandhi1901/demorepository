package com.cg.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.demo.bean.Bus;

public class ReservationService implements Runnable {

	private Bus bus;
	private List<Integer> seatsAlloted;
	private int requiredSeats;

	public ReservationService(Bus bus, int requiredSeats) {
		super();
		this.bus = bus;
		this.requiredSeats = requiredSeats;
	}

	private synchronized void reserve() {
		seatsAlloted = new ArrayList<Integer>();
		for (int i = 1; i <= requiredSeats; i++) {
			if (bus.getLastReservedSeat() == bus.getSeatCount()) {
//				System.out.println();
				break;
			} else {
				int seat = bus.getLastReservedSeat() + 1;
				bus.setLastReservedSeat(seat);
				seatsAlloted.add(seat);
			}
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
		}
	}

	public void run() {
		if ((bus.getSeatCount() - bus.getLastReservedSeat()) >= requiredSeats) {
			reserve();
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + " >> " + seatsAlloted);
		} else {
			System.out.println("Not enough seats");
		}
	}

}
