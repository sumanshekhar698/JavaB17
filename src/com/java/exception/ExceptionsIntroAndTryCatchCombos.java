package com.java.exception;

import java.util.Scanner;

public class ExceptionsIntroAndTryCatchCombos {

	public static void main(String[] args) {

//		Errors
//		Exceptions
//			- Unchecked :: No one forces you to handle
//			- Checked

		System.out.println("START");
		int[] nums = { 3, 2, 23, 2, 32 };

		Scanner sc = new Scanner(System.in);

//		Handling of Exceptions

//		try catch
//		try catch catch catch ....

//		try {// try cannot exist alone
//			
//		}
		
		
		
//		System.out.println(nums[nums.length / sc.nextInt()]);// Exception - ArrayIndexOutOfBoundsException

		try {
			System.out.println(nums[nums.length / sc.nextInt()]);// Exception - ArrayIndexOutOfBoundsException

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {// this is the default catch block, and it should be the last one
			e.printStackTrace();
		}
//		catch (Throwable e) {// Its advised not to catch Errors so, no catch with Throwable
//			e.printStackTrace();
//		}

		System.out.println("END");

	}

}
