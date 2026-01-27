package com.ibm.execption;

public class Application
{
	public static void main( String[] args )
	{
		try {
			System.out.println(args[0] +" "+ args[1]);
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException exeception) {
			System.out.println("You need to give 2numbers");
		}catch(ArithmeticException execption) {
			System.out.println("You can't divide by Zero");
		}catch(Exception exception) {
			System.out.println("Unknown Exception");
		}
		System.out.println("The End");
	}
}