package com.ibm.staticfeature;

class Test{
	static int value;
	
	Test() {
		System.out.println("Constructor called");
	}
	static {
		System.out.println("Static Intializer called");
		value=15;
	}
	{
		System.out.println("Inline book called");
	}
}

public class Application
{
	public static void main(String[] args) {
		new Test();
	}
	
}