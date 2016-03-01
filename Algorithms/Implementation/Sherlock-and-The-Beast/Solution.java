https://www.hackerrank.com/challenges/sherlock-and-the-beast

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static int[] extra={0,9,3,12,6};
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        int N,x5,x3,temp,t;
        
        while(T>0)
        {
            N=s.nextInt();
            x5=(N/3)*3; // no of 5's
            
            x3=N-x5;// no of 3's
            
            temp=(x3)%5;// extra no of 3's needed
            
            x5=(x5-extra[temp]);
            
            x3=x3+extra[temp];
            
            if(x5>=0 && x3+x5==N)
            {
                
              StringBuffer s1=new StringBuffer();
              
              for(int i=0;i<x5;i++)
              {
                s1=s1.append('5');
              }
              for(int i=0;i<x3;i++)
              {
            	  s1=s1.append('3');
              }
                System.out.println(s1);
                
            }
            else
            {
              System.out.println(-1);
            }
            
            
            T--;
        }
        
    }
}
