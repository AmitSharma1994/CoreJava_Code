package com.java.oops;


class A{
	A get() {
		return this;
	}
	
	
	void display() {
		System.out.println("this A class");
	}
}

class B extends A{
	
	@Override
	B get () {
		return this;
	}
	void display() {
		System.out.println("this B class");
	}
}

class C extends B{
	
}

public class CovarientType {

	public static void main(String[] args) {
		
		new B().get().display();
		new A().get().display();
		
	}
}
