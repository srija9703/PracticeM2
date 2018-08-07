package com.cg.module2prac.Employee.test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.cg.module2prac.Employee.model.Employee;
import com.cg.module2prac.Employee.service.EmployeeService;
import com.cg.module2prac.Employee.service.IEmployeeService;

public class test {

	
	private IEmployeeService service;
	
	@Before
	public void init() {
		service=new EmployeeService();
	}
	
	
	@Test
	public void testCreateEmpl() {
		Employee emp=new Employee();
		emp.setEid("e109");
		
	}

}
