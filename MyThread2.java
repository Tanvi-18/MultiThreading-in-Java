package com.jsp.MultiThreading;

public class MyThread2 extends Thread {

	// Approach 2
	
	@Override
	public void run() {
		
		for (int i=1; i<=500; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
