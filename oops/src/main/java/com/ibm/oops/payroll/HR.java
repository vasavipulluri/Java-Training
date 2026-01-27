package com.ibm.oops.payroll;

public class HR {
	public static Employee recuritIntern(String empType) {
		if(empType.equalsIgnoreCase("I")) {
			Intern intern =new Intern();
			return intern;
		} else if(empType.equalsIgnoreCase("P")) {
			return new PermanentEmployee();
		}
		else if(empType.equalsIgnoreCase("F")) {
			return new Freelancer();
		}
		
		return null;
	}
}

