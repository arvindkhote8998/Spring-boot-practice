package com.practice.service.consumer;

import java.util.Arrays;
import java.util.List;

public class Supplier {

	public static void main(String[] args) {
		
		/*
		 * java.util.function.Supplier<String> supplier= ()->"Hey I am Supplier";
		 * System.out.println(supplier.get());
		 */
		
		List<String> list = Arrays.asList("a","b");
		System.out.println(list.stream().findAny().orElseGet(()->"Not getting Anything Boys"));
	}
	
	

}
