package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class ListExample {

	public static void main(String[] args) {

		String s = "Arvind1998 khote";
	    String[] split = s.split(" ");
	    String s3="";
	    String s4="";
	    for(String s2 :split) {
	    	
	    	for(int i=0;i<s2.length();i++) {
	    		char charAt = s2.charAt(i);
	    		if(Character.isDigit(charAt)) {
	    			s3=s3+charAt;
	    		}else {
	    			s4=s4+charAt;
	    		}
	    	}
	    }
    	System.out.println(s3+s4);

	}
}
