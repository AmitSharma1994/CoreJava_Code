package com.indiabix;

class A {

	 int GetResult(int a, int b) {
		return 0;
	}

}

class B extends A{
	
	final int GetResult(int a, int b) {
		
		return 1;
	}
	
}

public class Test {

	public static void main(String[] args) {

		B b= new B();
		
		System.out.println("x="+ b.GetResult(1, 2));
		
		
	}

}
