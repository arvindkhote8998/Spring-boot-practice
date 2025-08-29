package com.practice.service.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Arvind");
		list.add("Zaker");
		list.add("Vinod");
		list.add("Arvind");
		//list.sort(null);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		
		Map<Integer,String> map = new LinkedHashMap<>();
		map.put(1, "Arvind");
		map.put(3, "Sham");
		map.put(2, "jill");
		map.put(8, "Don");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e->System.out.println(e));
	}
	
	
	

}
