package com.java.arrays;

import java.util.Arrays;

public class ReverseAnArrayOptimized {

	public static void main(String[] args) {

		int[] nums = { 32, 2, 765, 5, 34, 23, 299 };
		System.out.println(Arrays.toString(nums));
		System.out.println(nums.hashCode());

		int i = 0, j = nums.length - 1;

		while (i <= j) {// n/2

			// swapping mirror elements
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;

			i++;
			j--;

		}

		System.out.println(Arrays.toString(nums));
		System.out.println(nums.hashCode());

	}

}
