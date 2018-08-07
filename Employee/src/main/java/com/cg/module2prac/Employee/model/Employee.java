package com.cg.module2prac.Employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employee {

	@Id
	/*@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;*/
	private String eid;
	private String ename;
	private String project;
	private double salary;
	
	
	
	public Employee() {
		super();
	}
	public Employee(String eid, String ename, String project, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.project = project;
		this.salary = salary;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	
}
