package com.ibm.objectclass;

class Base {
	Base(int value) {
		System.out.println("Base:"+value);
	}
}
class Dervied extends Base{
	 Dervied(int value) {
		 super(value);
		System.out.println("Derivied:"+value);
	}
}
public class Superkey {

	public static void main(String[] args) {
		Dervied dervied =new Dervied(30);
	}

}
