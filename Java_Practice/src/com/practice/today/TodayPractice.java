package com.practice.today;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class TodayPractice {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(13);
		list.add(24);
		list.add(24);
		list.add(90);
		list.add(13);
		list.forEach(e->{
			System.out.println(e);
		});
		
		System.out.println("----Set--------");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("Arvind");
		set.add("Swaraj");
		set.add("Arvind");
		set.add("Swaraj");
		set.add(null);
		set.forEach(e->{
			System.out.println(e);
		});
		System.out.println("-----HashSet--------");
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("zakir");
		hashSet.add("Arvind");
		hashSet.add("Sanket");
		hashSet.add("Patil");
		hashSet.add(null);
		hashSet.forEach(e->{
			System.out.println(e);
		});
		System.out.println("----TreeSet--------");
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Zakir");
		treeSet.add("Ashub");
		treeSet.add("Nitya");
		//treeSet.add(null);
		treeSet.forEach(e->{
			System.out.println(e);
		});
		System.out.println("---Map----");
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(12, "Arjun");
		map.put(42, "Shani");
		map.put(22, "Prabhu");
		map.put(19, "Sham");
		map.put(9, "Balu");
		//map.put(null, "Sham");
		//map.put(null, null);
		Iterator<Integer> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println("key:"+ next);
			System.out.println("value:"+map.get(next));
		}
		System.out.println("----Next patter------");
		map.forEach((k,v)->{
			System.out.println("key:"+k+" "+"value:"+v);
		});
		
		System.out.println("----TreeMap---------");
		TreeMap<Integer, String> treeMap= new TreeMap<Integer, String>(map);
		treeMap.forEach((k,v)->{
			System.out.println("key:"+k+""+"value:"+v);
		});
	}

}
