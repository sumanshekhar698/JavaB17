package com.java.exception;

public class ExceptionPropagation {

	public static void main(String[] args) {// DEH - default Exception handler

		System.out.println("START");
		try {
			callA();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("END");

	}

	private static void callA() {

		callB();

	}

	private static void callB() {

		callC();

	}

	private static void callC() {
		System.out.println(9 / 0);

	}

}
