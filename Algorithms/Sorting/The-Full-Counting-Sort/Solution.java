//https://www.hackerrank.com/challenges/countingsort4

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[100];
        int[] x=new int[n];
        String[] str=new String[n];
        for(int i=0;i<n;i++)
            {
            x[i]=in.nextInt();
            a[x[i]]++;
            str[i]=in.next();            
        }
       /* for(int i=0;i<100;i++)
        {
            if(a[i]!=0)
            {
                System.out.println(i+" : "+a[i]);    
            }
            
        }*/
        StringBuilder s=new StringBuilder();
        for(int i=0;i<100;i++)
            {
            if(a[i]!=0)
                {
                int cnt=0;
             //   System.out.println(i+":"+a[i]);
                for(int j=0;j<n;j++)
                    {
                    if(cnt==a[i])
                        {
                        break;
                    }
                    if(i==x[j])
                        {
                        if((j+1)>(n/2))
                            {
                                s.append(str[j]);
                             s.append(" ");
                                
                        }
                        else
                            {
                          //  System.out.print(j);
                            s.append("- ");
                        }
                       
                     //   System.out.println(i+" "+str[j]);
                        cnt++;
                    }
                }
            }
        }
        System.out.println(s);
    }
}
