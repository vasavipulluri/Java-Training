package com.ibm.lambdas;

interface Printer3 {
	public void printing(String name,int count);
}

class Process3{
	public void execute(String printername,int count,Printer3 printer) {
		printer.printing(printername,count);
	}
}

public class Lambda3 {

	public static void main(String[] args) {
		Process3 process=new Process3();
		process.execute("HP",5,Lambda3::printIt);
		process.execute("Canon",8,(pname,count)->System.out.println(pname+" printer printing " +count+ " pages."));

	}
	
	static void printIt(String name,int count) {
		System.out.println(name+"printer printing " +count+ " pages.");
	}

}
