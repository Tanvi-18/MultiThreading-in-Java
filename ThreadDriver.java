package com.jsp.MultiThreading;

public class ThreadDriver {
	
	public static void main(String[] args) {
		
		//Approach 1
		MyThread myThread = new MyThread();		
		Thread t = new Thread(myThread);
		t.start();
		
		
		//Approach 2
		MyThread2 myThread2 = new MyThread2();
		myThread2.start();			
			
	}

}
