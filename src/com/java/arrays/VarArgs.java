package com.java.arrays;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {

		test("", 32,23,23,2);

	}

	static void test(String str, int... nums) {// var args should be the last parameter
		
		System.out.println(Arrays.toString(nums));

	}

}
