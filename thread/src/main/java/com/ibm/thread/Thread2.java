package com.ibm.thread;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
	int count;
	Task(int count) {
		this.count=count;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread()+" ---> "+count);
		//System.out.println(new Date());
		
	}
	
}

public class Thread2 {

	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(10);
		
		for(int counter=0;counter<10;counter++) {
			service.submit(new Task(counter));
		}
		service.shutdown();
		
		System.out.println("The End");
		

	}

}
