package com.springboothibernate.employeemanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboothibernate.employeemanagement.model.Employee;

@Repository
@Transactional
public class EmployeeDao {

	@PersistenceContext
	private EntityManager entityManager;

	public Employee getById(int id) {
		return entityManager.find(Employee.class, id);
	}

	public void save(Employee employee) {
		entityManager.persist(employee);
	}

}
