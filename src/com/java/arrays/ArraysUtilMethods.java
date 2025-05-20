package com.java.arrays;

import java.util.Arrays;

public class ArraysUtilMethods {

	public static void main(String[] args) {
		int[] nums = { 32, 2, 765, 5, 34, 23, 299 };

		System.out.println(Arrays.toString(nums));

//		The sorting algorithm is a Dual-Pivot Quicksort. This algorithm offers O(n log(n))
		Arrays.sort(nums);// ASC
		System.out.println(Arrays.toString(nums));

		Arrays.sort(nums);// SORT + reverse for DSC

		Arrays.fill(nums, -1);
		System.out.println(Arrays.toString(nums));

		Arrays.fill(nums, 3, 5, 100);
		System.out.println(Arrays.toString(nums));
		
//		TODO binarySearch your self
		int index = Arrays.binarySearch(nums, 100);
		System.out.println(index);

	}

}
