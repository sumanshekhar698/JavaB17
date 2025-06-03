package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ToDoHomework1_ReverseListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(67);
		nums.add(78);
		nums.add(null);
		nums.add(76879);
		nums.add(67);
		nums.add(234);
		nums.add(425);
		nums.add(null);// Be Very careful while storing null , as it will give error while sorting
		nums.add(2343);
		
		System.out.println("Sequential");
		Iterator<Integer> iterator = nums.iterator();// TODO reverse the printing logic using iterator
		while (iterator.hasNext()) {// iterator
			Integer num = (Integer) iterator.next();
			System.out.print(num + " ");
		}

		System.out.println("\n");
		System.out.println("Reverse");
		ListIterator<Integer> iteratorRev = nums.listIterator(nums.size());// TODO reverse the printing logic using
																			// iterator
		while (iteratorRev.hasPrevious()) {// iterator
			Integer num = (Integer) iteratorRev.previous();
			System.out.print(num + " ");
		}

	}

}
