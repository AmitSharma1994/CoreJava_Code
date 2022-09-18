package com.collection;
import java.util.*;  
public class TestJavaCollection2{  
public static void main(String args[]){
	
	//ArrayList<String> list=new ArrayList<String>();
	//LinkedList<String> al=new LinkedList<String>();
	//Vector<String> v=new Vector<String>();  
	//Stack<String> stack = new Stack<String>(); 
	//PriorityQueue<String> queue=new PriorityQueue<String>(); 
	
LinkedList<String> al=new LinkedList<String>();  
al.add("Ravi");  
al.add("Vijay");  
al.add("Ravi");  
al.add("Ajay");  
Iterator<String> itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  