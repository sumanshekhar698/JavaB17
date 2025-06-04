package com.advance.multithreading;

public class Main {

	public static void main(String[] args) {// Single Thread Program

		System.out.println("START");
		System.out.println(Thread.currentThread());// main,5,main :: thread name, priority, parent thread
//		By Default all the threads have a priority of 5

//		for (int i = 1; i <= 9; i++) {
//			try {
//				Thread.sleep(500);
//				System.out.println(i + "" + Thread.currentThread());
//
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}

//		1st way
		Worker t1 = new Worker();
//		worker.run();
		t1.setName("t1");
		t1.setPriority(8);//1 - 10
		t1.start();

		Worker t2 = new Worker();
		t2.setName("t2");
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		
//		2nd Way
		Thread t3 = new Thread(new Work());
		t3.setName("t3");
		t1.setPriority(Thread.MIN_PRIORITY);
		t3.start();

		Thread t4 = new Thread(() -> {
			for (int i = 1; i <= 9; i++) {
				try {
					Thread.sleep(250);// ms
					System.out.println(i + " " + Thread.currentThread());

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t4.start();

		System.out.println("END");
	}

}
