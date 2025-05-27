package com.java.oops.inheritance;

public class A {

	int x = 9;

	public static void main(String[] args) {
		C c = new C();
//		System.out.println(c.x);
		c.test();
	}

}

class B extends A {

	int x = 10;
	
	void speak() {
		System.out.println("speaking B");
	}
	
	final void listen() {// you cannot @Override a final fn
		System.out.println("listening B");
	}
}

class C extends B {

	int x = 11;
	
	void test(){
		System.out.println(x);
		System.out.println(super.x);
//		System.out.println(super.super.x);
		speak();
		listen();
//		super.speak();
	}
	
	@Override//Annotations
	void speak() {//Method Overriding :: Polymorphism ( Runtime Polymorphism)
		System.out.println("speaking C");
	}
	
//	@Override
//	void listen() {
//		System.out.println("listening C");
//	}
}

final class D{// final classes cannot be inherited
	
}

//class E extends D{
//	
//}

//class X extends Y{
//	
//}
//
//class Y extends X{
//	
//}