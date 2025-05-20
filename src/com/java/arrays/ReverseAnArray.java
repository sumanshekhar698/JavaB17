package com.java.arrays;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {

		int[] nums = { 32, 2, 765, 34, 23, 299 };
		System.out.println(Arrays.toString(nums));
		System.out.println(nums.hashCode());

		int[] backup = new int[nums.length];

		for (int i = nums.length - 1, j = 0; i >= 0; i--) {
			backup[j++] = nums[i];
		}
		
		System.out.println(Arrays.toString(backup));
//		nums = backup;
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] =  backup[i];
		}
		
		System.out.println(Arrays.toString(nums));
		System.out.println(nums.hashCode());


		
		


	}

}
