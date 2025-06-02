package com.java.maps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

//		K:V

		HashMap<Integer, String> map = new HashMap<Integer, String>();// K:V Entry
		map.put(4, "john");
		map.put(7, "lilly");
		map.put(3, "macx");
		map.put(9, "jane");
		map.put(4, "marie");// Keys are unique and hashed, Values can be duplicate

		System.out.println(map.size());

		Set<Entry<Integer, String>> entrySet = map.entrySet();

		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		
		System.out.println(map.containsKey(7));
		

	}

}
