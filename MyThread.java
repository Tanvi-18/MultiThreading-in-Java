package com.jsp.MultiThreading;

public class MyThread implements Runnable{

	// Approach 1 
	
	@Override
	public void run() {
				
		for (int i=500; i>=500; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}


	
	

