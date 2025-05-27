package com.java.oops.inheritance;

import com.java.oops.encapsulation.Gender;

public class IPLPlayer extends Player {

	String team;
	int runs;
	int wickets;
	int jerseyNumber;

//	Rules of Inheritance in Java
	
//	1. super points to the immediate Parent class, you can access variables and fn
//	2. You have to call at least one Parent Constructor, super()
//	3. super() call should be the 1st statement in the Constructor
//	4. You can do chaining OR calling Parent constructor
//	5. You cannot have multiple Inheritance but you can have Multi Level Inheritance
//	6. Cyclic or circular Inheritance in not allowed
//	7. In Java Every class will have a Parent, Object class is the default parent you haven't declared anything explicitly
//	8. You cannot @Override a final fn
//	9. Method Overriding :: Polymorphism ( Runtime Polymorphism)
//	10. final classes cannot be inherited
//	11. static fn cannot be overidden, her method HIDING is happening in case of static fns
	

	
	
//	public IPLPlayer(String name, int age, Gender gender) {
//		super(name, age, gender);// super points to immediate Parent
//	}

	public IPLPlayer(String name, int age, Gender gender, String team,
			int runs, int wickets, int jerseyNumber) {
//		this();
		super(name, age, gender);
		System.out.println("IPLPlayer(String name, int age, Gender gender, String team,\r\n"
				+ "			int runs, int wickets, int jerseyNumber) called");
		this.team = team;
		this.runs = runs;
		this.wickets = wickets;
		this.jerseyNumber = jerseyNumber;
	}
	
//	public IPLPlayer() {
//		super("", 4, null);
//	}

	@Override
	public String toString() {
		return "IPLPlayer [team=" + team + ", runs=" + runs + ", wickets=" + wickets + ", jerseyNumber=" + jerseyNumber
				+ ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
