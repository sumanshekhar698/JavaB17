package com.java.arrays;

public class ArrayCloning1D {

	public static void main(String[] args) {
		int[] nums = { 32, 2, 765, 5, 34, 23, 299 };

//		int[] dup = nums;
//
//		dup[0] = -1;
//		System.out.println(nums[0]);

		int[] dup2 = new int[nums.length];

		for (int i = 0; i < dup2.length; i++) {
			dup2[i] = nums[i];

		}

		dup2[0] = -1;
		System.out.println(nums[0]);

		int[] cloned = nums.clone();// Its should be 1D Array

		cloned[0] = -1;
		System.out.println(nums[0]);

	}

}
