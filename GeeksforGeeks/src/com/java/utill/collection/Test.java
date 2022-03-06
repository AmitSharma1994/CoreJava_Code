/**
 * 
 */
package com.java.utill.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author Amit Sharma
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Int 3,4,5,7,7,5,2,1,6
	//	List <Integer> list=new ArrayList<Integer>();
	HashSet<Integer> hs=new HashSet<Integer>();	
		int [] arr=new int[] {3,4,5,7,7,5,2,1,6};
       
		for(int i=0;i<arr.length;i++) {
			
			hs.add(arr[i]);
			
			
		}
		
		System.out.println(findsecond(hs));
		
		
	}

	public static  int findsecond(HashSet<Integer> list1) {
		ArrayList< Integer> al=new ArrayList<Integer>();
		int max=0;
		
		for(Integer j:list1) {
			if(max<j) {
				max=j;
			}
			
		al.add(j);
			
		}
		
		list1.remove(max);
		
		for(Integer j:list1) {
			if(max<j) {
				max=j;
			}
			
			
		}
		
		return max;
		
	}
}
