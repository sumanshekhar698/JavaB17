package com.java.strings.mutable;

public class BattleOfStrings {

	public static void main(String[] args) {

//		String java = "Java";
//
//		long start = System.nanoTime();
//		for (int i = 0; i < 2_00_000; i++) {// Time taken 20465400000 ns = 20,465,400,000 = 20.4 seconds
//			java = java.concat(" is Easy ");
//		}
//		long end = System.nanoTime();
//		System.out.println("Time taken " + (end - start));

		StringBuilder sb = new StringBuilder("Java");
		long start1 = System.nanoTime();
		for (int i = 0; i < 2_00_000; i++) {// Time taken 17827061100 ns = 17,827,061,100 = 17.8 seconds
			sb.append("is Easy ");
		}
		long end1 = System.nanoTime();
		System.out.println("Time taken " + (end1 - start1));// Time taken 4,649,100 ns = 004,649,100 = 0.004 seconds

	}

}
