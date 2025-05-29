package com.java.exception;

public class ThrowsExample {

//	public static void main(String[] args) throws InterruptedException {//DEH - default Exception handler
	public static void main(String[] args) {

		try {
			callA();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void callA() throws InterruptedException {

		callB();

	}

	private static void callB() throws InterruptedException {

		callC();

	}

	private static void callC() throws InterruptedException {
		for (int i = 0; i < 10; i++) {

//			Checked Exception
			Thread.sleep(300);// I am delegating it

			System.out.println(i);
		}

	}

}
