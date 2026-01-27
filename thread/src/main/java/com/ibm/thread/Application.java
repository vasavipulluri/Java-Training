package com.ibm.thread;

class Runner implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The Current thread is "+Thread.currentThread());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class Application
{
	public static void main( String[] args )
	{
		Runner runner = new Runner();
		Thread producer = new Thread(runner,"Producer");
		Thread consumer = new Thread(runner,"Consumer");
		
		producer.start();
		consumer.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(producer.getState());
		System.out.println(consumer.getState());
		
		System.out.println("The End");
	}
}