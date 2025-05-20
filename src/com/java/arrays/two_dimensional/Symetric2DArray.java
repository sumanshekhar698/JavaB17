package com.java.arrays.two_dimensional;

import java.util.Arrays;

public class Symetric2DArray {

	public static void main(String[] args) {

		int[][] mat = new int[3][5];

		for (int i = 0; i < mat.length; i++) {// iterate over all the 1D arrays
			for (int j = 0; j < mat[i].length; j++) {/// iterate into the individual 1D array
				System.out.print(mat[i][j] + " ");

			}
			System.out.println();
		}
		
		
//		for (int i = 0; i < mat.length; i++) {// iterate over all the 1D arrays
//			System.out.println(Arrays.toString(mat[i]));
//		}

	}

}
