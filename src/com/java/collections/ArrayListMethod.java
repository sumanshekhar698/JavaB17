package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethod {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(67);
		nums.add(78);
//		nums.add(null);
		nums.add(76879);
		nums.add(67);
//		nums.add(null);// Be Very careful while storing null values

		nums.add(3, 8978);
		System.out.println(nums);

//		nums.addLast(78);

		boolean contains = nums.contains(67);// linear time O(n) --> DSA
		System.out.println(contains);

		System.out.println(nums.isEmpty());

		Collections.sort(nums);
		System.out.println(nums);

		Collections.sort(nums, Collections.reverseOrder());
		System.out.println(nums);
		
		Collections.shuffle(nums);
		System.out.println(nums);

		nums.clear();
		System.out.println(nums);

	}

}
