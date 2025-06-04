package com.advance.multithreading;

public class PM_Main {

	public static void main(String[] args) {
//		PrimeMinister pm1 = new PrimeMinister("Mr Modi", 65);

		PrimeMinister pm1 = PrimeMinister.declarePM("Mr Modi", 65);

		System.out.println(pm1);
		System.out.println(pm1.hashCode());

//		PrimeMinister pm2 = new PrimeMinister("Mr Gandhi", 45);
//		System.out.println(pm2);
//		System.out.println(pm2.hashCode());

//		PrimeMinister.pm = null;
		PrimeMinister pm2 = PrimeMinister.declarePM("Mr Gandhi", 45);

		System.out.println(pm2);
		System.out.println(pm2.hashCode());

	}

}
