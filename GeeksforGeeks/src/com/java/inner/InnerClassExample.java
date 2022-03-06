/**
 * 
 */
package com.java.inner;

/**
 * @author Amit Sharma
 *
 */
public class InnerClassExample {
	private static  String name="AmitKumarSharam";

	/**
	 * @param args
	 */
	
	
	public void displymain() {
		System.out.println("main class method");
	}
	
	static class staicinner{
		
		void display() {
			System.out.println("message from static inner"+name);
		}
		
	}
	
	
	
	class inner{
		
		void printmessage() {
			System.out.println("message from outer class"+name);
		}
		
	}
	
	
	public static void main(String[] args) {
	

		staicinner si=new staicinner();
		
		si.display();
		
		InnerClassExample ice=new InnerClassExample();
		InnerClassExample.inner inner1=ice.new inner();
		InnerClassExample.inner inner=new InnerClassExample(). new inner();
		
		
		
	}

}
