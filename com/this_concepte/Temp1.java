package com.this_concepte;

public class Temp1 {
	int x=10;
	
	void show(int y) {
		System.out.println(this.x);
		System.out.println(y);
		
		
	}
	
public static void main(String[] args) {
	Temp1 t=new Temp1();
	t.show(20);
	System.out.println(t.x);
	
}
}
