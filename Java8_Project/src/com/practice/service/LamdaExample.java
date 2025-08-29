package com.practice.service;

public class LamdaExample {

	public static void main(String[] args) {
		/*
		 * MyInterface myInterface=()->{ System.out.println("Hey This is lamda Exampe");
		 * 
		 * }; myInterface.message(); }
		 */

		MyInterface myInterface = (a, b) -> {
			return (a + b);
		};
		System.out.println(myInterface.sum(12, 23));
	}
}
