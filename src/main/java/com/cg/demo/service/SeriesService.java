package com.cg.demo.service;

import java.util.Iterator;

public class SeriesService implements Runnable {
	private int lowerBound;
	private int upperBound;

	public SeriesService(int lowerBound, int upperBound) {
		super();
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}

	public void generate() {

		Thread thread = Thread.currentThread();

		for (int i = lowerBound; i <= upperBound; i++) {
			System.out.println(thread.getName() + ">>" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void run() {
		generate();
	}

}
