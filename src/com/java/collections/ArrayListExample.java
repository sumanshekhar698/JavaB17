package com.java.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import com.java.oops.encapsulation.Gender;
import com.java.oops.encapsulation.Student;

// Collections only contain Objects
public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("hey");
		list.add(77);
		list.add(new Student("John", 33, LocalDate.now(), Gender.MALE));
		System.out.println(list);

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(67);
		nums.add(78);
		nums.add(null);
		nums.add(76879);
		nums.add(67);
		nums.add(null);// Be Very careful while storing null values

		System.out.println(nums);

		// Iterate on a collection
//		for (int i = 0; i < nums.size(); i++) {
//			System.out.println(nums.get(i));
//			nums.add(7);
//		}

		for (Integer num : nums) {// for each
			System.out.print(num + " ");
//			nums.add(7); // You should not modify a collection on which you are iterating
		}

		System.out.println();
		Iterator<Integer> iterator = nums.iterator();//TODO reverse the printing logic using iterator
		while (iterator.hasNext()) {// iterator
			Integer num = (Integer) iterator.next();
			System.out.print(num + " ");
//			nums.add(7);
		}

		System.out.println("\n");
		nums.stream().filter(x -> x != null).forEach(System.out::println);// :: method reference operator

	}

}
