package com.collection;

// Generic and specific different
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		ArrayList<Object> obj = new ArrayList<Object>();
		

		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		obj.add(60);
		obj.add(70);
		obj.add(80);
		obj.add(90);
		obj.add("pawan");

		// System.out.println(obj.get(0));

		System.out.println(obj.get(9));
		
		System.out.println(obj.get(0));

	}

}
