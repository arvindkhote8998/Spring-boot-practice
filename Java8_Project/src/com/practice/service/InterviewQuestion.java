package com.practice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class InterviewQuestion extends ArrayList{

	@Override
	public boolean add(Object o) {
		if(this.contains(o)) {
			return true;
		}else {
		 return super.add(o);
		}
	}
	
	public static void main(String[]args) {
		InterviewQuestion q= new InterviewQuestion();
		q.add("Arvind");
		q.add("Arvind");
		q.add("Govind");
		q.add("Sanket");
		
		System.out.println(q);
		
	}
}
