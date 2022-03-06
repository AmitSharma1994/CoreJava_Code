/**
 * 
 */
package com.java.utill.collection;

/**
 * @author Amit Sharma
 *
 */
import java.io.*;
import java.util.*;
public class CandidateCode {
static	List<String> list=new ArrayList<String>();
    public static void main(String args[] ) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       	
        String line;
    
        	
            while ((line = br.readLine()) != null)
            {
                String[] tokens = line.split("\\s");
               // System.out.println(Arrays.toString(tokens));
                
                list.add(Arrays.toString(tokens));
           
             
            }
            
            System.out.println("Hello0");
            
            br.close();
            System.out.println("Hello1");
            findMax(list);
            System.out.println("Hello2");
    
        
        
     

   }
    
    
    public static int findMax(List<String> list1) {
    	
    	
    	System.out.println(list1);
    	return 0;
    }
    
}