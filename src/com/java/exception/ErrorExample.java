package com.java.exception;

public class ErrorExample {

	static int counter = 0;

	public static void main(String[] args) {
		callMe();//Exception in thread "main" java.lang.StackOverflowError

	}

	static void callMe() {//Recursive
		System.out.println(counter++);//15142
		callMe();
		System.out.println("END of callMe()");
	}

}
