package com.ibm.execption;

class IllegalAgeException extends Exception {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "You need to be 18 or above to register for voting";
	}
}
class voting {
	void register(int age) throws IllegalAgeException {
		
		if(age<18) {
			throw new IllegalAgeException();
		}
	}
}
public class Age {
	public static void main(String[] args) {
		voting vote=new voting();
		try {
			vote.register(15);
		} catch (IllegalAgeException e) {
			System.out.println("Catch block executed");
			e.printStackTrace();
		}
		System.out.println("The End");
	}
}
