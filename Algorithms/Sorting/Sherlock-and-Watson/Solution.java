//https://www.hackerrank.com/challenges/sherlock-and-watson

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
        int k=in.nextInt();
        k=k%n;
        int q=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();        
        for(int i=0;i<q;i++)
            {
            int y=in.nextInt();
            y=y-k;
            if(y<0)
                y=y+n;
             System.out.println(a[y]);
        }
           
    }
}
