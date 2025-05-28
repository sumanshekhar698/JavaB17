package com.java.oops.abstraction;

public class Main {

	public static void main(String[] args) {

		BankAccount ac1 = new BankAccount("Billy", 9089878765L);
		System.out.println(ac1);
		ac1.withdraw(1000);
		
		ac1.deposit(1000);
		
		ac1.deposit(250);
		
		long withdraw = ac1.withdraw(900);
		ac1.checkBalance();
		
//		You cannot instantiate[creating objects] an abstract class DIRECTLY
//		BankAccountAbstracted ac2 = new BankAccountAbstracted();//ERROR
		
		BankAccountAbstracted ac2 = new BankAccountAbstracted("Jim", 9899898767L) {//Annonymous Inner Type
			
			@Override
			long withdraw(long amount) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			void deposit(long amount) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			long checkBalance() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		
		BankAccountAbstracted ac3;
		
		
		 ac3 = new BankAccountImplementation("Samy",987678654L);
		System.out.println(ac3);

	}

}