package com.springboothibernate.employeemanagement.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboothibernate.employeemanagement.model.Employee;
import com.springboothibernate.employeemanagement.service.EmployeeService;

@RestController
public class EmployeeResource {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(path = "/employees/{id}", method = RequestMethod.GET)
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(name = "id") int id) {
		try {
			return new ResponseEntity<Employee>(employeeService.getEmployeeById(id), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
		}
	}

	@RequestMapping(path = "/employees", method = RequestMethod.POST)
	public ResponseEntity<Void> saveEmployee(@RequestBody Employee employee) {
		try {
			employeeService.saveEmployee(employee);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

	}
}
