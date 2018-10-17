package com.springboothibernate.employeemanagement.service;

import com.springboothibernate.employeemanagement.model.Employee;

public interface EmployeeService {
	
	Employee getEmployeeById(int id);
	
	void saveEmployee(Employee employee);

}
