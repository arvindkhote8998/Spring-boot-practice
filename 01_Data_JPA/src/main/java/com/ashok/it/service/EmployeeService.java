package com.ashok.it.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashok.it.entity.Employee;
import com.ashok.it.repository.EmployeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeRepository employeRepository;
	
	public Employee saveDetail() {
		Employee employee = new Employee();
		employee.setEmplId(10);
		employee.setEmpName("Praju");
		employee.setEmpGender("Fe-Male");
		employee.setSalary(80000.00);
		Employee result = employeRepository.save(employee);
		return result;
	}
	
	public void saveeMultipalData() {
		Employee employee = new Employee();
		employee.setEmplId(6);
		employee.setEmpName("Raju");
		employee.setEmpGender("Male");
		employee.setSalary(50000.00);
		
		Employee employee1 = new Employee();
		employee1.setEmplId(7);
		employee1.setEmpName("Kajal");
		employee1.setEmpGender("Fe-Male");
		employee1.setSalary(90000.00);
		
		Employee employee3 = new Employee();
		employee3.setEmplId(2);
		employee3.setEmpName("Arun");
		employee3.setEmpGender("Male");
		employee3.setSalary(70000.00);
		
		List<Employee> list = Arrays.asList(employee,employee1,employee3);
		employeRepository.saveAll(list);
	}
	
	public Employee getDetail() {
		Optional<Employee> findById = employeRepository.findById(2);
		System.out.println(findById.get());
		return findById.get();
	}
	public List<Employee> findByGender(String geneder){
		List<Employee> findByEmpGender = employeRepository.findByEmpGender(geneder);
		findByEmpGender.forEach(System.out::println);
		return findByEmpGender;
	}
	
	public List<Employee> getEmployeeDet() {
		List<Employee> employeeDet = employeRepository.getEmployeeDet();
		employeeDet.forEach(System.out::println);
		return employeeDet;
	}
	public List<Employee> getEmpBySalary(Double salary){
		List<Employee> empBySalary = employeRepository.getEmpBySalary(salary);
		empBySalary.forEach(System.out::println);
		return empBySalary;
	}
	public void deleteEmp(Integer id){
		employeRepository.deleteEmp(id);
	}
}
