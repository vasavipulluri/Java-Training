package com.ibm.lambdas;

interface Printer2 {
	public void printing(String name);
}

class Process2{
	public void execute(String printername,Printer2 printer) {
		printer.printing(printername);
	}
}

public class Lambda2 {

	public static void main(String[] args) {
		Process2 process=new Process2();
		process.execute("HP",System.out::println);
		process.execute("Canon",(name)->System.out.println(name+" printer printing"));

	}

}
