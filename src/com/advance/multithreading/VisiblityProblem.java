package com.advance.multithreading;

public class VisiblityProblem {

	static volatile boolean flag = true;//volatile Enhance the visibility

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			while (flag) {
				System.out.println("STOP ME IF YOU CAN!!!");
			}
		});
		t1.start();

		Thread t2 = new Thread(() -> {
			flag = false;
		});
		t2.start();

	}

}
