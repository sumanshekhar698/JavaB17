package com.java.arrays;

public class PassByValuePassByRef {

	public static void main(String[] args) {
		int[] nums = { 32, 2, 765, 5, 34, 23, 299 };
		int x = 99;

		callMe(nums, x);//nums pass the ref
		//x i passed as value
		System.out.println(nums[0]);//900
		System.out.println(x);//99

	}

	static void callMe(int[] nums, int x) {
		
		x = 100;
		nums[0] = 900;
		

	}

}
