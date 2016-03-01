//https://www.hackerrank.com/challenges/closest-numbers

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
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        Arrays.sort(a);
        int[] b=new int[a.length-1];
        int min=Math.abs(a[0]-a[1]);
        for(int i=0;i<(a.length-1);i++)
            {
            int x=Math.abs(a[i]-a[i+1]);
            b[i]=x;
            if(x<min)
                {
                min=x;
            }
        }
        for(int i=0;i<b.length;i++)
            {
            if(b[i]==min)
                {
                System.out.print(a[i]+" "+a[i+1]+" ");
            }
        }
    }
}
