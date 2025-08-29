package com.practice;

public class SecondPracice {

	public static void main(String[] args) {

		int i, j;
		int row = 5;
		for (i = 0; i <= row; i++) {
			for (j = 0; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}

		System.out.println("----------Next Patter---------");

		for (i = row; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println("------Next Pattern---------");
		
		for(i=0;i<=row-1;i++) {
			for(j=0;j<=i;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
