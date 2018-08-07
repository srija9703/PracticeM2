package com.cg.module2prac.Employee.repo;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.module2prac.Employee.model.Employee;

@Repository
@Transactional
@PersistenceContext
public interface IEmployeeRepo extends JpaRepository<Employee, String> {
}

/*
 * @Query("SELECT a FROM Employee a WHERE a.eid=:id") public Employee
 * updateEmployee(@Param("id") String id); }
 */
/*
 * @Query("DELETE from Employee a WHERE a.eid=:id") public boolean
 * deleteEmployee(@Param("id") String id); }
 */
