package com.practice;

public class PraticeProgram {

	public static void main(String[] args) {
		int i, j = 0, row = 4;

		for (i = 0; j <= row; i++) {
			for (j = 0; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		for (i = row - 1; i >= 1; i--) {
			for (j = 0; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
