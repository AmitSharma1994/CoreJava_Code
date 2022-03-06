package com.java.utill.collection;

import java.util.HashMap;

/**
 * @author Amit Sharma
 *
 */

class Student{
	String name;
	int id;
	public Student(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	
	
}


public class HashMApSize {
	
	public static void main(String[] args) {
		
		Student s1=new Student("Amit",100);
		Student s2=new Student("Amit",100);
		
		HashMap<Object, Integer> hm=new HashMap<Object, Integer>();
		hm.put(s1, 10);
		hm.put(s2, 20);
		
		System.out.println(hm.size());
		System.out.println(hm.get(s1));
		
	
		
		
	}

}
