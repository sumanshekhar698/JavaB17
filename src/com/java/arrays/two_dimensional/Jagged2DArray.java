package com.java.arrays.two_dimensional;

import java.util.Arrays;

public class Jagged2DArray {

	public static void main(String[] args) {

		int[][] jagged = new int[3][];
		
		jagged[0] = new int[5];
		jagged[1] = new int[3];
		jagged[2] = new int[4];
		
		//printing the 
		for (int i = 0; i < jagged.length; i++) {
			System.out.println(Arrays.toString(jagged[i]));
		}
		
		System.out.println();
		for (int i = 0; i < jagged.length; i++) {// iterate over all the 1D arrays
			for (int j = 0; j < jagged[i].length; j++) {/// iterate into the individual 1D array
				System.out.print(jagged[i][j] + " ");

			}
			System.out.println();
		}
		
		
	}

}
