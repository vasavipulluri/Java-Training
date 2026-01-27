package com.ibm.oops;

import com.ibm.oops.payroll.Finance;
import com.ibm.oops.payroll.Employee;
import com.ibm.oops.payroll.HR;
import com.ibm.oops.payroll.Intern;
import com.ibm.oops.payroll.PermanentEmployee;

public class Application
{
	public static void main( String[] args )
	{
		//Employee employee= new PermanentEmployee();
		//employee.netPay();
		Finance finance=new Finance();
		Employee employee1 = HR.recuritIntern("P");
		if(employee1!= null) {
//			employee.netPay();
			System.out.println("Permenannt employee");
			finance.processPay(employee1);
		}
		
		Employee employee2=HR.recuritIntern("I");
		if(employee2 != null) {
//			employee2.netPay();
			System.out.println("Intern Employee");
			finance.processPay(employee2);
		}
		Employee employee3=HR.recuritIntern("F");
		if(employee3 != null) {
//			employee3 .netPay();
			System.out.println("Freelancer");
			finance.processPay(employee3);
		}
	}
}