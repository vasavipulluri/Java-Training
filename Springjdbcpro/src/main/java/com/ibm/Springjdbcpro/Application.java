package com.ibm.Springjdbcpro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ibm.Springjdbcpro.config.DatabaseConfig;
import com.ibm.Springjdbcpro.dao.DepartmentDao;
import com.ibm.Springjdbcpro.dao.EmployeeDao;
import com.ibm.Springjdbcpro.model.Department;
import com.ibm.Springjdbcpro.model.Employee;

public class Application
{
	public static void main( String[] args )
	{
			AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DatabaseConfig.class);

			DepartmentDao departmentDao = ctx.getBean(DepartmentDao.class);
			EmployeeDao employeeDao = ctx.getBean(EmployeeDao.class);

			Department d = new Department();
			d.setName("IT");
			departmentDao.save(d);

			Employee e = new Employee();
			e.setName("Arafath");
			e.setSalary(15000);
			e.setDepartmentId(1);
			employeeDao.save(e);

			employeeDao.findAll().forEach(emp -> System.out.println(emp.getName() + " - " + emp.getDepartmentId()+ " - " + emp.getSalary()));

			ctx.close();
	}
}