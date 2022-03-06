/**
 * 
 */
package com.java.utill.collection;

import java.util.ArrayList;

/**
 * @author Amit Sharma
 *
 */
public class DupliacteRemArrayList {

	/**
	 * @param args
	 */
	/*
	 * //Algorithm
	 * 
	 * 1.create new arraylist which empty size which contatin after removing
	 * duplicate data.
	 * 
	 * 2.Iterate through for each loop of given list
	 * 
	 * 3.use contain method of arraylist for validateing element are persent in list
	 * or not 4.then iterete throug for each loop.
	 */
	
	
	
	
	public static void main(String[] args) {


		ArrayList <String> al=new ArrayList();
		al.add("4");
		al.add("5");
		al.add("6");
		al.add("4");
		al.add("3");
		al.add("4");
		
		
		ArrayList <String> alduprem=new ArrayList();
		
		
		for(String element : al) {
			
			if(!alduprem.contains(element)) {
				
				alduprem.add(element);
			}
			
		}
		
		for(String element2: alduprem) {
			
			System.out.print(element2);
		}

	}

}
