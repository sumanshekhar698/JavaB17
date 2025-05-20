package com.java.arrays.two_dimensional;

import java.util.Arrays;

public class MatrixAddition {

	public static void main(String[] args) {

		int[][] mat1 = { { 32, 654, 6 }, { 32, 43, 2 }

		};

		int[][] mat2 = { { 34, 23, -23 }, { 24, 123, 465 }
		};

//		Matrix Multiplication TODO
		
		// their dimension should be same
		if (mat1.length == mat2.length && mat1[0].length == mat2[0].length) {

			int[][] res = new int[mat1.length][mat1[0].length];

			// Addition into res
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[i].length; j++) {
					res[i][j] = mat1[i][j] + mat2[i][j];

				}
			}
			
			

			//printing the res
			for (int i = 0; i < res.length; i++) {
				System.out.println(Arrays.toString(res[i]));
			}

		} else {
			System.out.println("Matrix Addition not possible");
		}

	}

}
