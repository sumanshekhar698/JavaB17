package com.java.oops.abstraction.intefaces;

public class Main {

	public static void main(String[] args) {

		BankAccountImpl ac4 = new BankAccountImpl("Jane", 78677939200L);
		System.out.println(ac4);

		BankInterface ac5 = new BankInterface() {

			@Override
			public long withdraw(long amount) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void deposit(long amount) {
				// TODO Auto-generated method stub

			}

			@Override
			public long checkBalance() {
				// TODO Auto-generated method stub
				return 0;
			}
		};

	}

}
