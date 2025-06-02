package com.java.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());//Max Heap Tree
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();//Min Heap Tree
		pq.add(54);
		pq.add(24);
		pq.add(-23);
		pq.add(123);
		pq.add(-32);
		pq.add(32);
		
//		[-32, -23, 24, 123, 54, 32]

		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq);
//		pq.ad
	}

}
