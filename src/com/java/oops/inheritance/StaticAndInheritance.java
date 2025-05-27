package com.java.oops.inheritance;

public class StaticAndInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Childe child = new Childe();
		System.out.println(child.x);
		child.test();

	}

}

class Par {

	static int x = 99;//static variables get inherited
	
	 static void test() {//static method/fn get inherited
		System.out.println("test Parent");
	}

}

class Childe extends Par {

//	@Override
	static void test() {//static method/fn get inherited
		System.out.println("test Child");
	}//static fn cannot be overidden, her method HIDING is happening in case of static fns
}
