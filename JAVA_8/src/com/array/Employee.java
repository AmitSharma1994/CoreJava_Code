package com.array;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee> {
    
	int id;
	String name ;
	double salary;
	
	public Employee(int i, String n, double d) {
		this.id=i;
		this.name=n;
		this.salary=d;
	}
	
	@Override
	public int compareTo(Employee o) {
	  
		int agec=this.name.compareTo(o.name);
		
		return agec;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	}



class EmployeeMain{
	public static void main(String[] args) {
		
		
	     ArrayList<Employee> list=new ArrayList();
	     
	     Employee e1=new Employee(3,"sam",5000.00);
	     Employee e2=new Employee(6,"amy",15000.00);
	     Employee e3=new Employee(9,"brad",25000.00);
	     Employee e4=new Employee(7,"dogw",30000.00);
	   
	     
	     
	     list.add(e1);
	     list.add(e2);
	     list.add(e3);
	     list.add(e4);
	     System.out.println("Before sorting");
	     for(Employee ep:list) {
	    	 System.out.println(ep);
	     }
	     
	     Collections.sort(list);
	     
	     System.out.println("After  sorting");
	     
	     for(Employee ep:list) {
	    	 System.out.println(ep);
	     }
	    
		}
}