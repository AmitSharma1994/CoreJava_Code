package com.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employe {

	int id;
	String name;
	int age;
	String gender;
	
	public Employe(int id, String name, int age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public static void main(String[] args) {
		Employe em=new Employe(101,"ABC",10,"M");
		Employe em1=new Employe(101,"ABC",15,"M");
		Employe em2=new Employe(101,"ABC",5,"M");
		Employe em3=new Employe(101,"ABC",20,"M");
		
		
		List l=new ArrayList<Employe>();
		
		l.add(em);
		l.add(em1);
		l.add(em2);
		l.add(em3);
		
		List mylist=(List) l.stream().sorted().collect(Collectors.toList());

	
	}
	
	
	
}
