package com.cg.module2prac.Employee.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.module2prac.Employee.EmployeeException.EmployeeException;
import com.cg.module2prac.Employee.model.Employee;
import com.cg.module2prac.Employee.repo.IEmployeeRepo;

@Service
@Transactional
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeRepo repo;

	

	@Override
	public Employee createEmployee(Employee e) throws EmployeeException {
		if(validateEmployee(e))
		{
			return repo.save(e);
		}else
		{
			throw new EmployeeException("Please enter valid name");
		}
	}

	@Override
	public Employee updateEmployee(Employee e) {

		Employee emp= repo.getOne(e.getEid());
		emp.setEid(e.getEid());
		emp.setEname(e.getEname());
		emp.setProject(e.getProject());
		emp.setSalary(e.getSalary());
		/*em.merge(emp);*/
		return emp;
		
		
	}

	@Override
	public void deleteEmployee(String id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);
	}

	public List<Employee> viewAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<Employee> findByEId(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}
	
	public boolean validateEmployee(Employee e)
	{
		if(e.getEname().matches("[A-Z][a-z]{2,10}"))
		{
			return true;
		}
		
		return false;
	}

}
