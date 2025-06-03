package com.java.maps;

import java.util.HashMap;

public class ToDoHomeWork2_FrequencyMaker {

	public static void main(String[] args) {
		int arr[] = { 423, 23, 3, 23, 32, 2, 2, 24, 42, 2, 42, -6378, 42, 2, -24, -23 };
//		 TODO frequency Table
//		K : V

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : arr) {
			if (!map.containsKey(num)) {
				map.put(num, 1);

			} else {
				map.put(num, map.get(num) + 1);

			}
		}
		System.out.println(map);
		System.out.println();

		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();

		for (int num : arr) {
			map2.put(num, map2.getOrDefault(num, 0) + 1);
		}
		System.out.println(map2);

	}

}
