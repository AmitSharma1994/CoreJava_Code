/**
 * 
 */
package com.java.multithreding;

/**
 * @author Amit Sharma
 *
 */
public class ThredExample extends Thread {

	/**
	 * @param args
	 */
	
	@Override
	public void run() {
		
		System.out.println("Thread is Running");
	}
	
	
	
	public static void main(String[] args) {
	
		ThredExample th=new ThredExample();
		th.start();

	}

}
