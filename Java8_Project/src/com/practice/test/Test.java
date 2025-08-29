package com.practice.test;

import java.util.ArrayList;import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Kartik");
		list.add("Krushna");
		list.add("Snehal");
		list.add("KK");
		list.stream().filter(t->t.startsWith("K")).forEach(t->System.out.println(t));
		System.out.println("_____________");
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Arvind");
		map.put(3, "Arjun");
		map.put(2, "Akash");
		map.put(6, "Anand");
		//map.entrySet().forEach(t->System.out.println(t));
		map.entrySet().stream().filter(key -> key.getKey()%2 == 0).forEach(obj->System.out.println(obj));
	}

}
