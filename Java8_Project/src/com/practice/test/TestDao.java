package com.practice.test;

import java.util.ArrayList;
import java.util.List;

public class TestDao {

	public static List<Employee> getData(){
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Arvind","Payment",2300));
		list.add(new Employee("Krushna","Payment",80000));
		list.add(new Employee("Arjun","Payment",20000));
		
		return list;
	}
	
}
