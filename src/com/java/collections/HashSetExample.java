package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class HashSetExample {

	public static void main(String[] args) {

		int[] arr = { 321, 23, 23, 2, 2, 3, 1, 3223, };
		
		ArrayList list = new ArrayList();
		
		for (Integer num : arr) {
			if(!list.contains(num)) {
				list.add(num);
			}
		}
		
		
		System.out.println(list);
		
		// No Duplicate allowed
		HashSet<Integer> set = new HashSet<Integer>();//Hashing
		for (Integer num : arr) {
			set.add(num);
		}
		System.out.println(set);
		System.out.println(set.contains(23));//O(1) Constant time
		
		
		HashSet<Integer> set2 = (HashSet<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toSet());
		System.out.println(set2);
		
	

	}

}
