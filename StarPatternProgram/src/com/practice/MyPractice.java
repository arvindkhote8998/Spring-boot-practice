package com.practice;

public class MyPractice {

	public static void main(String[] args) {
		
		int i,j=0 ; 
		int row =3;
		
		/*
		 * for(i=0;i<row;i++) {
		 * 
		 * for(j=0;j<=i;j++) { System.out.printf("*"); } System.out.println(); }
		 */
		for(i=row;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}

}
