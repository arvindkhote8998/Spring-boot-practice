package com.practice.service.entity;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Employee> list = Java8Test.getDatabase();
		//list.forEach(System.out::println);
		//List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee:: getSalary)).collect(Collectors.toList());
	
		//list.stream().filter(employee->employee.getSalary() > 60000).forEach(System.out::println);
		//String string = list.stream().max(Comparator.comparing(Employee:: getSalary)).map(Employee:: getEmpname).get();
		//String string1 = list.stream().max(Comparator.comparing(Employee:: getSalary)).s.map(Employee:: getEmpname).get();

		 Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Employee:: getDepartment,Collectors.counting()));
		System.out.println(collect);

	}
}
