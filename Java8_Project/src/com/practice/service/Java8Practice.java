package com.practice.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.practice.service.entity.Employee;

public class Java8Practice {

	public static void main(String[] args) {
		List<Employe>list = new ArrayList<>();
		list.add(new Employe(12,"Arvind","IT",78000.00));
		list.add(new Employe(13,"Vedika","Tesing",50000.00));
		list.add(new Employe(14,"Sanket","IT",40000.00));
		list.add(new Employe(15,"shalu","Pharmccy",30000.00));
		
		//list.stream().forEach(System.out::println);
		
		//list.stream().filter(employe->employe.getSalary() >=50000).forEach(System.out::println);
		//list.stream().filter(employe->employe.getSalary() >=50000).map(Employe::getEmployeeName).forEach(System.out::println);
		//list.stream().filter(employe->employe.getDepartment().equalsIgnoreCase("IT")).map(Employe::getEmployeeName).forEach(System.out::println);
	// String string = list.stream().max(Comparator.comparing(Employe:: getSalary)).map(Employe:: getEmployeeName).get();
		//list.stream().map(Employe:: getEmployeeName).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		Map<String, List<Employe>> collect = list.stream().collect(Collectors.groupingBy(Employe::getDepartment));
System.out.println(collect);

Map<String, Long> collect2 = list.stream().collect(Collectors.groupingBy(Employe::getDepartment,Collectors.counting()));
System.out.println(collect2);


	}

}
