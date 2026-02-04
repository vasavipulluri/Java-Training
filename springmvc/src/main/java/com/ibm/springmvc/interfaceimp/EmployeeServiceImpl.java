package com.ibm.springmvc.interfaceimp;

import org.springframework.stereotype.Service;

import com.ibm.springmvc.dao.EmployeeDao;
import com.ibm.springmvc.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private  final EmployeeDao employeeDao;
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}
	@Override
	public void insertEmployee(Employee employee) {
		employeeDao.save(employee);

	}

}
