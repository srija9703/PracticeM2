package com.cg.module2prac.Employee.service;

import java.util.List;
import java.util.Optional;

import com.cg.module2prac.Employee.EmployeeException.EmployeeException;
import com.cg.module2prac.Employee.model.Employee;

public interface IEmployeeService {

	public Employee createEmployee(Employee e) throws EmployeeException;
	public Employee updateEmployee(Employee e);
	public void deleteEmployee(String id);
	public List<Employee> viewAll();
	public Optional<Employee> findByEId(String id);
	
}
