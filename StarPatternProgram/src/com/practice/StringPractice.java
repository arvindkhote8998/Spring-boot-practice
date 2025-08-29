package com.practice;

import java.util.HashMap;
import java.util.Map;

public class StringPractice {

	public static void main(String[] args) {
		String str="Hello guys";
		char[] array = str.toCharArray();
		
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]);
		}
		
	}
}
