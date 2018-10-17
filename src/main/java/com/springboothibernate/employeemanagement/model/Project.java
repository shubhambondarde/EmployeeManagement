package com.springboothibernate.employeemanagement.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Project {

	@Id
	private int id;
	private String name;
	// private List<Employee> empList;
	//
	// public void addEmployee(Employee employee) {
	// if (empList == null) {
	// empList = new ArrayList<Employee>();
	// }
	// empList.add(employee);
	// }
}
