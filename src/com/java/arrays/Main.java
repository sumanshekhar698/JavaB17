package com.java.arrays;

import java.util.Arrays;

import com.java.oops.constructors.Truck;

public class Main {

	public static void main(String[] args) {

		int nums[] = new int[5];
		Truck trucks[] = new Truck[5];

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

		System.out.println();
		for (int num : nums) {// for each OR enhanced for loop
			System.out.print(num + " ");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(nums));

	}

}
