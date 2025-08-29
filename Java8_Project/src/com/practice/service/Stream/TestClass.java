package com.practice.service.Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {

	public static void main(String[] args) {
		
		Employee employee = new Employee(1,"Arvind",7000.00,"Payment");
		Employee employee1 = new Employee(2,"Shamrao",9000.00,"Payment");
		Employee employee2 = new Employee(3,"Ssanket",2000.00,"FSCM");
		Employee employee3 = new Employee(4,"yash",3000.00,"Banking");

		List<Employee> list = Arrays.asList(employee,employee1,employee2,employee3);
		List<Employee> list2 = list.stream().filter(emp->emp.getSalary() < 5000).collect(Collectors.toList());
		System.out.println(list2);
		
		List<Employee> collect = list.stream().filter(emp->emp.getDepartment().equalsIgnoreCase("payment")).collect(Collectors.toList());
		System.out.println(collect);
	}

}
