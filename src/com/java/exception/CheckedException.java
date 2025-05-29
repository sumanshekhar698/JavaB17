package com.java.exception;

public class CheckedException {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			
//			Checked Exception
			try {
				Thread.sleep(700);//you must handle it
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}

}
