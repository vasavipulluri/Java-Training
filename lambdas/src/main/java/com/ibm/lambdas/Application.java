package com.ibm.lambdas;

interface Printer {
	public void printing(String name);
}

class Process1{
	public void execute(String printername,Printer printer) {
		printer.printing(printername);
	}
}

public class Application
{
	public static void main( String[] args )
	{
		Process1 process=new Process1();
		process.execute("HP",(name)->System.out.println(name+" printer printing"));
		process.execute("Canon",(name)->System.out.println(name+" printer printing"));
	}
}