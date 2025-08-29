package com.ashok.it.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ashok.it.entity.Employee;

import jakarta.transaction.Transactional;

public interface EmployeRepository extends CrudRepository<Employee, Integer>{

	public List<Employee> findByEmpGender(String geneder);
	
	@Query("From Employee")
	public List<Employee> getEmployeeDet();
	
	@Query(value="Select * from employee_detail where salary =:salary", nativeQuery = true)
	public List<Employee> getEmpBySalary(Double salary);
	
	@Transactional
	@Modifying
	@Query(value="delete from employee_detail where emp_id =:empId", nativeQuery = true)
	public void deleteEmp(Integer empId);
	
}
