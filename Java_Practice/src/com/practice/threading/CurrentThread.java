package com.practice.threading;

public class CurrentThread extends Thread {

	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println("Current Thread is:"+i);
		}
	}
}
