package com.ibm.interfaces;

public class Airplane implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Airplane is taking off");

	}

	@Override
	public void fly() {
		System.out.println("Airplane is flying");

	}

	@Override
	public void land() {
		System.out.println("Airplane is landing");

	}

}
