package com.cg.demo;

import com.cg.demo.service.SeriesService;

public class demo {

	public static void main(String[] args) {

		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());

		SeriesService s1 = new SeriesService(11, 20);
		SeriesService s2 = new SeriesService(21, 30);
//		s1.generate();
//		s2.generate();

		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("ThankYou!!");
	}

}
