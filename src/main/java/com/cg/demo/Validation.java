package com.cg.demo;

import com.cg.demo.service.SeriesService;

public class Validation {

	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		
		int lowerBound = 0;
		int upperBound = 10;
		SeriesService seriesService = new SeriesService(lowerBound, upperBound);
		seriesService.generate();
	}

}
