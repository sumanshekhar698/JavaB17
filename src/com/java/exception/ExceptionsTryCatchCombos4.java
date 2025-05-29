package com.java.exception;

import java.util.Scanner;

public class ExceptionsTryCatchCombos4 {

	public static void main(String[] args) {

//		Errors
//		Exceptions
//			- Unchecked
//			- Checked

		System.out.println("START");
		int[] nums = { 3, 2, 23, 2, 32 };

//		Handling of Exceptions

//		try catch
//		try catch catch catch ....
//		try catch with fusion catch ....
//		try catch with fusion catch finally....
//		try finally
//		try() finally
//		try()
//	    try() catch with fusion catch finally....

		try (Scanner sc = new Scanner(System.in);) {//try with resource

		} finally {
			// TODO: handle finally clause
		}

		try (Scanner sc = new Scanner(System.in);) {

		}

		try (Scanner sc = new Scanner(System.in);) {// AutoCloseable
			System.out.println(nums[nums.length / sc.nextInt()]);// Exception - ArrayIndexOutOfBoundsException
			return;

		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {// java 8 features enables us to fuse two
																			// catch blocks
			e.printStackTrace();
		} catch (Exception e) {// this is the default catch block, and it should be the last one
			e.printStackTrace();
		} finally {// we put cleanup code/logic here
			System.out.println("finally!!");
//			sc.close();
		}

//		sc.close();
		System.out.println("END");

	}

}
