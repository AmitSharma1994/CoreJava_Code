package com.array;
import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_A = br.readLine().split(" ");
         long[] A = new long[N];
         for(int i_A = 0; i_A < arr_A.length; i_A++)
         {
         	A[i_A] = Long.parseLong(arr_A[i_A]);
         }

         long out_ = count_combinations(A);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static long count_combinations(long[] A){
        long count=-1;
     int n=A.length-1;
       for(int i=n;i>=0;i-- ){
           for(int j=n-1;j>0;j--){
            if(A[i]!=-1&&A[j]!=-1)
               
                   A[i]=A[i]+A[j];
                    A[j]=-1;
                   
                    count++;

               
           }
            
       }
       
    return count;
    }
}