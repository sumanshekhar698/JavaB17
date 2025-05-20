package com.java.arrays.two_dimensional;

import java.util.Arrays;

public class ArrayCloning2D {

	public static void main(String[] args) {

		int[][] mat = { { 34, 23, -23 }, { 24, 123, 465 } };

		int[][] clone = new int[mat.length][];
		
		for (int i = 0; i < clone.length; i++) {
			clone[i] = mat[i].clone();
			
		}
		
		for (int i = 0; i < clone.length; i++) {
			System.out.println(Arrays.toString(clone[i]));
		}
		
		
		System.out.println(Arrays.toString(clone));
		
		
		

	}

}
