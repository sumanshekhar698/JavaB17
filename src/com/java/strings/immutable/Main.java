package com.java.strings.immutable;

public class Main {

	public static void main(String[] args) {

//		Strings are sequence of Characters
//		1. Immutable
//		2. Mutable

//		In Java Strings are Object and is constructed by the String class
//		String class Object will always be IMMUTABLE

//		Without New Keyword, the object is stored in normal HEAP
		String str1 = new String("MISSION IMPOSSIBLE");
		String str2 = new String("MISSION IMPOSSIBLE");

//		Without New Keyword, the object is stored in CP (no Duplicate Values Allowed)
		String str3 = "MISSION IMPOSSIBLE";// You can create a String object without New keyword
		String str4 = "MISSION IMPOSSIBLE";// You can create a String object without New keyword

		String str5 = "mission IMPOSSIBLE";// You can create a String object without New keyword

//		== only compare Object reference/address

		if (str3 == str2) {
			System.out.println("Equal reference");
		} else {
			System.out.println("UnEqual reference");
		}

		if (str3.equals(str5)) {
			System.out.println("Equal values");
		} else {
			System.out.println("UnEqual values");
		}

		if (str3.equalsIgnoreCase(str5)) {
			System.out.println("Equal values");
		} else {
			System.out.println("UnEqual values");
		}

	}

}
