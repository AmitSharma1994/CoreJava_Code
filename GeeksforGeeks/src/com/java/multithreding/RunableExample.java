/**
 * 
 */
package com.java.multithreding;

/**
 * @author Amit Sharma
 *
 */
public class RunableExample  {

	/**
	 * @param args
	 */
	
	public int x=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunableExample re=new RunableExample();
		float f[]=new float[5];
		
		Object obj=f;
		System.out.println(f[0]);
	}

	/**
	 *
	 */
	/**
	 *
	 */
	public void run() {
		System.out.println("Thread is running");
		
		
	}

}
