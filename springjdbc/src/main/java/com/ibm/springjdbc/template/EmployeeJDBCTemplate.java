package com.ibm.springjdbc.template;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ibm.springjdbc.dao.EmployeeDao;
import com.ibm.springjdbc.mapper.EmployeeMapper;
import com.ibm.springjdbc.model.Employee;

public class EmployeeJDBCTemplate implements EmployeeDao{
	private DataSource datasource;
	private JdbcTemplate jdbcTemplateObject;
	@Override
	public void setDataSource(DataSource datasource) {
		this.datasource=datasource;
		this.jdbcTemplateObject=new JdbcTemplate(datasource);
	}

	@Override
	public void create(String firstname, String lastname, Integer salary) {
		String SQL="insert into Employee (firstname,lastname,salary) values(?,?,?)";
		jdbcTemplateObject.update(SQL,firstname,lastname,salary);
		System.out.println("created record name = "+firstname+" salary : "+salary);
		
	}

	@Override
	public Employee getEmployee(Integer id) {
		String SQL="select * from Employee where id=?";
		Employee employee=jdbcTemplateObject.queryForObject(SQL, new EmployeeMapper(),id); 
		return employee;
	}

	@Override
	public List<Employee> listEmployees() {
		String SQL="select * from Employee";
		List<Employee> employee=jdbcTemplateObject.query(SQL,new EmployeeMapper());
		return employee;
	}

	@Override
	public void delete(Integer id) {
		String SQL="delete from Employee where id=?";
		jdbcTemplateObject.update(SQL,id);
		System.out.println("Deleted recored with Id = "+id);
	}

	@Override
	public void update(Integer id, String firstname, String lastname, Integer salary) {
		String SQL="update Employee set salary = ? where id=?";
		jdbcTemplateObject.update(SQL,salary,id);
		System.out.println("Updated the recored with salary = "+id);
		
	}
}
