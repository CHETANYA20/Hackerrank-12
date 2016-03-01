//https://www.hackerrank.com/challenges/diagonal-difference

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum1=0;
        int sum2=0;
        int a[][] = new int[n][n];
        int x=0;int y=n-1;
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		a[i][j]=in.nextInt();
        		if(i==j)
        		{
        			sum1+=a[i][j];
        		}
        		if(i==x && j==y)
        		{
        			sum2+=a[i][j];
        			x++;y--;
        		}
        	}
        }
        int sum=0;
        if(sum1>sum2)
        {
        	sum=sum1-sum2;
        }
        else
        {
        	sum=sum2-sum1;
        }
        //System.out.println(sum1+" "+sum2);
        System.out.println(sum);
        
    }
}
