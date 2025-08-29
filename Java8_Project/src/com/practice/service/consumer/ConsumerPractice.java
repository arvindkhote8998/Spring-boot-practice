package com.practice.service.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {

	public static void main(String[] args) {
		
	/*Consumer<Integer> consumer=(a)->{
			System.out.println("Print:"+a);
		};
		consumer.accept(10);
	}*/
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream().forEach(t->System.out.println(t));
	}	

}
