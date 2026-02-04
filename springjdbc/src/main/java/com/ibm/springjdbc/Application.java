package com.ibm.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.springjdbc.model.Employee;
import com.ibm.springjdbc.template.EmployeeJDBCTemplate;

public class Application
{
	public static void main( String[] args )
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc.xml");
		
		EmployeeJDBCTemplate employeeJDBCTemplate = (EmployeeJDBCTemplate) context.getBean("employeeJDBCTemplateBean");
		
		System.out.println("-------Records Created--------");
		employeeJDBCTemplate.create("Smith", "Raj", 15000);
		employeeJDBCTemplate.create("Allen", "Peter", 18000);
		
		System.out.println("-------Listing Multiple Records--------");
		List<Employee> employees=employeeJDBCTemplate.listEmployees();
		
		for (Employee employee:employees) {
			System.out.println("ID : " +employee.getId());
			System.out.println(", First Name : " +employee.getFirstname());
			System.out.println(", Last Name : " +employee.getLastname());
			System.out.println(", Salary : " +employee.getSalary());
		}
		employeeJDBCTemplate.update(2, "Allen", "Nelson", 20000);
		
//		Employee employee=employeeJDBCTemplate.getEmployee(2);
//		System.out.println("ID : " +employee.getId());
//		System.out.println(", First Name : " +employee.getFirstname());
//		System.out.println(", Last Name : " +employee.getLastname());
//		System.out.println(", Age : " + employee.getSalary());
		
		employeeJDBCTemplate.delete(2);
		
	}
	
	
}