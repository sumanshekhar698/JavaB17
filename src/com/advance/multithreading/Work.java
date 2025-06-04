package com.advance.multithreading;

public class Work implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 9; i++) {
			try {
				Thread.sleep(250);// ms
				System.out.println(i + " " + Thread.currentThread());

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
