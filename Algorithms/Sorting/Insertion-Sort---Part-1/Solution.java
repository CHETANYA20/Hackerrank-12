//https://www.hackerrank.com/challenges/insertionsort1

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {   

    public static void insertIntoSorted(int[] ar) {
        int temp=ar[ar.length-1];
        int c=0;
        for(int i=ar.length-2;i>=0;i--)
        {
            if(ar[i]>temp)
            {
                c++;
               // System.out.print("c:"+c);
              /*  if(c==ar.length-1)
                {
                    ar[i+1]=ar[i];
                    ar[i]=temp;
                    break;
                }
                else*/
                {
                     ar[i+1]=ar[i];
                }
               
            }
            else
            {
                ar[i+1]=temp;
                break;
            }
             printArray(ar);
             if(c==ar.length-1)
             {
                ar[i]=temp;
             }
        }
        printArray(ar);
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
 
