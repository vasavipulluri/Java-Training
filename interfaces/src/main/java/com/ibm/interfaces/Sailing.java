package com.ibm.interfaces;

public class Sailing implements Flyer, Sailer {

	@Override
	public void sail() {
		System.out.println("Boat Sailing");

	}

	@Override
	public void dock() {
		System.out.println("Boat Docking");

	}

	@Override
	public void takeOff() {
		System.out.println("Boat Taking Off");

	}

	@Override
	public void fly() {
		System.out.println("Boat Flying");

	}

	@Override
	public void land() {
		System.out.println("Boat Landing");

	}

}
