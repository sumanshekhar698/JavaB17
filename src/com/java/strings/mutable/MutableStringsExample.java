package com.java.strings.mutable;

public class MutableStringsExample {

	public static void main(String[] args) {

//		StringBuilder
//		StringBuffer

		StringBuilder sb = new StringBuilder("Hey");

//		Thread Safe
		StringBuffer sbuf = new StringBuffer("Hey");// MT env, multi threaded

		sb.append(" Hii");
		sb.append(" How ");

		System.out.println(sb);

		sb.length();
		sb.delete(2, 4);
		System.out.println(sb);

		String str = "MADAM";

		boolean equals = str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());// Palindrome Checker
		System.out.println(equals);

	}

}
