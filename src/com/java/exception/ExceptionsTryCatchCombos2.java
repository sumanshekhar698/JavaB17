package com.java.exception;

import java.util.Scanner;

public class ExceptionsTryCatchCombos2 {

	public static void main(String[] args) {

//		Errors
//		Exceptions
//			- Unchecked
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

		try {
			System.out.println(nums[nums.length / sc.nextInt()]);// Exception - ArrayIndexOutOfBoundsException

		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {// java 8 features enables us to fuse two catch blocks
			e.printStackTrace();
		}
//		catch (ArithmeticException e) {
//			e.printStackTrace();
//		}
		catch (Exception e) {// this is the default catch block, and it should be the last one
			e.printStackTrace();
		}
//		catch (Throwable e) {// Its advised not to catch Errors so, no catch with Throwable
//			e.printStackTrace();
//		}
		
//		sc.close();
		System.out.println("END");

	}

}
