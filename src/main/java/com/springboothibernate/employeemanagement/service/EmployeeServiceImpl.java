package com.springboothibernate.employeemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboothibernate.employeemanagement.dao.EmployeeDao;
import com.springboothibernate.employeemanagement.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public Employee getEmployeeById(int id) {
		return employeeDao.getById(id);
	}

	public void saveEmployee(Employee employee) {
		employeeDao.save(employee);
	}

}