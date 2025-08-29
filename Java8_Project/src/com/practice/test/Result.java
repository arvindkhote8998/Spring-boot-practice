package com.practice.test;

import java.util.List;
import java.util.stream.Collectors;

public class Result {

	public static List<Employee> gettaxData(String s){
		if(s.equalsIgnoreCase("tax")) {
		List<Employee> list = TestDao.getData().stream().filter(emp-> emp.getSalary()>50000).collect(Collectors.toList());
		return list;
		} else {
			List<Employee> list = TestDao.getData().stream().filter(emp-> emp.getSalary()<=50000).collect(Collectors.toList());
			return list;
		}
	}
	public static void main(String[] args) {
		
		System.out.println(Result.gettaxData("non tax"));
	}

}
