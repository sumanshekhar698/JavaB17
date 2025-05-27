package com.java.oops.inheritance;

import com.java.oops.encapsulation.Gender;

public class RCBPlayer extends IPLPlayer{
	
	
	long amountPurchased;
	int tenureBondInYear;
	
	
	public RCBPlayer(String name, int age, Gender gender, String team,
			int runs, int wickets, int jerseyNumber,
			long amountPurchased, int tenureBondInYear) {
		super(name, age, gender, team, runs, wickets, jerseyNumber);
		System.out.println("RCBPlayer(String name, int age, Gender gender, String team,\r\n"
				+ "			int runs, int wickets, int jerseyNumber,\r\n"
				+ "			long amountPurchased, int tenureBondInYear) called");
		this.amountPurchased = amountPurchased;
		this.tenureBondInYear = tenureBondInYear;
	}


	@Override
	public String toString() {
		return "RCBPlayer [amountPurchased=" + amountPurchased + ", tenureBondInYear=" + tenureBondInYear + ", team="
				+ team + ", runs=" + runs + ", wickets=" + wickets + ", jerseyNumber=" + jerseyNumber + ", name=" + name
				+ ", age=" + age + ", gender=" + gender + "]";
	}
	

}
