package com.ibm.springmvc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ibm.springmvc.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	private final JdbcTemplate jdbcTemplate;

	public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int save(Employee e) {
		return jdbcTemplate.update("INSERT INTO employee(name,email,phone) VALUES (?,?,?)", e.getName(),
				e.getEmail(), e.getPhone());
	}

	public int update(Employee e) {
		return jdbcTemplate.update("UPDATE employee SET name=?, email=?, phone=? WHERE name=?", e.getName(),
				e.getEmail(), e.getPhone(), e.getName());
	}


	
}