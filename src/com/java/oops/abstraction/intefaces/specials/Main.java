package com.java.oops.abstraction.intefaces.specials;

public class Main {

	public static void main(String[] args) {

		Eagle eagle = new Eagle();
		eagle.fly();

		Bird sparrow = new Bird() {

			@Override
			public void fly() {
				System.out.println("Sparrow is flying");

			}
		};
		sparrow.fly();

//		Using Lamda
		Bird owl = () -> {
			System.out.println("Owl is flying");

		};
		owl.fly();

	}

	static class Eagle implements Bird {// Inner Class, and they can be static also

		@Override
		public void fly() {
			System.out.println("Eagle is flying");

		}

	}

}
