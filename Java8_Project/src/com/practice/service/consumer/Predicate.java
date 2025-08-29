package com.practice.service.consumer;

import java.util.Arrays;
import java.util.List;

public class Predicate {

	public static void main(String[] args) {
		
		/*
		 * java.util.function.Predicate<Integer> predicate= (t-> t%2==0);
		 * System.out.println(predicate.test(11));
		 */

		List<Integer> list = Arrays.asList(1, 22, 34, 45, 55, 67);
		list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("Even Number is:" + t));
	}

}
