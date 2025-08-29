package com.practice.service.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8Test {

	public static List<Employee> getDatabase() {
		
		List<Employee> list = new ArrayList<>();
		Employee employee = new Employee();
		employee.setEmpId(12);
		employee.setEmpname("pritam");
		employee.setSalary(50000.00);
		employee.setDepartment("Pharmacy");
		
		Employee employee1 = new Employee();
		employee1.setEmpId(13);
		employee1.setEmpname("Arvind");
		employee1.setSalary(150000.00);
		employee1.setDepartment("IT");
		
		Employee employee2 = new Employee();
		employee2.setEmpId(14);
		employee2.setEmpname("Sanket");
		employee2.setSalary(70000.00);
		employee2.setDepartment("Testing");
		
		Employee employee3 = new Employee();
		employee3.setEmpId(15);
		employee3.setEmpname("Suraj");
		employee3.setSalary(80000.00);
		employee3.setDepartment("IT");
		
		Employee employee4 = new Employee();
		employee4.setEmpId(16);
		employee4.setEmpname("Aniket");
		employee4.setSalary(90000.00);
		employee4.setDepartment("Doctor");
		
		List<Employee> asList = Arrays.asList(employee,employee1,employee2,employee3,employee4);
		return asList;
	}

}
