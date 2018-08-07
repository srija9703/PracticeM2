package com.cg.module2prac.Employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.module2prac.Employee.EmployeeException.EmployeeException;
import com.cg.module2prac.Employee.model.Employee;
import com.cg.module2prac.Employee.service.IEmployeeService;

/*import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
*/
@RestController
//@JsonIgnoreProperties.....(something)
public class EmployeeController {

	@Autowired
	private IEmployeeService service;

	@RequestMapping(value="/create", method=RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee e) throws EmployeeException  {
		
			return service.createEmployee(e);
		
		
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee e) {
		return service.updateEmployee(e);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public void deleteEmployee(String id) {
		service.deleteEmployee(id);
	}

	@RequestMapping(value = "/viewAll", method = RequestMethod.GET)
	public List<Employee> viewAll() {
		return service.viewAll();
	}

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public Optional<Employee> findByEId(String id) {
		return service.findByEId(id);
	}

}
