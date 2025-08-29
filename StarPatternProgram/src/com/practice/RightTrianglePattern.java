package com.practice;

import java.util.Arrays;

public class RightTrianglePattern {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int targetSum=15;
		
		Arrays.sort(arr);
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			int sum = arr[left] + arr[right];
			if(sum == targetSum) {
			 System.out.println("Pair found: (" + arr[left] + ", " + arr[right] + ")");
			 left++;
             right--;
			}else if (sum < targetSum) {
	            left++;
	        } else {
	            right--;
	        }
		}
	}
}
