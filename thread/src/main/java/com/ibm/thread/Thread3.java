package com.ibm.thread;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task1 implements Runnable{
	int count;
	Task1(int count){
		this.count=count;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread()+"--->"+count);
	}
}
public class Thread3 {
	public static void main(String[] args) {
		int Vcpus=Runtime.getRuntime().availableProcessors();
		System.out.println(Vcpus);
		ExecutorService service=Executors.newFixedThreadPool(4);
		System.out.println(new Date());
//	    service.schedule(new Task1(1),4, TimeUnit.SECONDS);
		
		((ScheduledExecutorService) service).scheduleWithFixedDelay(new Task1(3), 10, 5, TimeUnit.SECONDS);
		System.out.println("The End");
		
	}

}