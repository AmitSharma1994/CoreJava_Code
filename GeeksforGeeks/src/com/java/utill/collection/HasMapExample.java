/**
 * 
 */
package com.java.utill.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author Amit Sharma
 *
 */
public class HasMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap();
		Scanner scan=new Scanner(System.in);
		//1.adding the element from map
		hm.put(1, "amit");
		hm.put(2, "pawan");
		hm.put(3, "neha");
		hm.put(4, "userid");
		hm.put(5, "manu");
		hm.put(6, "type");
		hm.put(7, "userd");
		//2.removing the element from hasmap
		hm.remove(5);
		//3.getting the element from hasmap
		System.out.println(hm.get(1));
		
		//4.Traversal of HashMap
		
		// for-each loop
//        for (Map.Entry<String,String> e : hm.entrySet())
//        	
//            System.out.println("Key: " + e.getKey()
//                          + " Value: " + e.getValue());
		
		for(Entry<Integer, String> gh:hm.entrySet()) {
			
			System.out.println(gh.getKey()+"\t"+gh.getValue());
		}
		
		System.out.println(hm);
		

	}

}
