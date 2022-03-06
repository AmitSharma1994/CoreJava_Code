package com.array;

public class Test2 {

	
	
	void add(int a,int b) {
		
		if(true)
			System.out.println("hello1");
		if(a!=5) 
			return;
		System.out.println(a+b);
		
		System.out.println("hello2");
		
	}
	
	
	
	public static void main(String[] args) {
		
		Test2 t2=new Test2();
		t2.add(6,10);
	}
}
