package com.springboothibernate.employeemanagement.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "emailid")
	private String emailId;

	@Column(name = "mobilenumber")
	private long mobileNumber;

	@ElementCollection
	private List<String> skills;

	// @Column(name = "project")
	// private Project project;

	public void addSkill(String skill) {
		if (skills == null) {
			skills = new ArrayList<String>();
		}
		skills.add(skill);
	}

	public void removeSkill(String skill) {
		if (skill != null) {
			skills.remove(skill);
		}
	}
}
