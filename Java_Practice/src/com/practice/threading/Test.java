package com.practice.threading;

public class Test {

	public static void main(String[] args) {
		System.out.println("main thread is running");
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();
		CurrentThread currentThread = new CurrentThread();
		currentThread.start();
		System.out.println(thread.getName());
		System.out.println(thread.isAlive());

	}

}
