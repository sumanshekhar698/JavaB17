package com.java.oops.abstraction;

import java.util.logging.Logger;

// R1: If any method is abstract, the class should be abstract
// R2: An abstract class can have 0 or more abstract fn/method
// 0 to 100 % abstraction
abstract public class BankAccountAbstracted {
	private static long noOfAccounts = 0L;// auto increment at the DB level
	final long acNo;
	final String name;
	long phoneNo;
	public int balance;
	boolean hasRequestedLoan;

	 static final Logger LOG = Logger.getLogger(BankAccountAbstracted.class.getName());

	public BankAccountAbstracted(String name, long phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.acNo = ++noOfAccounts;

	}

	abstract long checkBalance();

	abstract void deposit(long amount);

	abstract long withdraw(long amount);

	@Override
	public String toString() {
		return "BankAccountAbstracted [acNo=" + acNo + ", name=" + name + ", phoneNo=" + phoneNo + ", balance=" + balance
				+ ", hasRequestedLoan=" + hasRequestedLoan + "]";
	}

}
