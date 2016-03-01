//https://www.hackerrank.com/challenges/find-digits

import java.io.*;
import java.util.Scanner;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int no=in.nextInt();
        for(int k=0;k<no;k++)
            {
		int n=in.nextInt();
		String x1=String.valueOf(n);
		char[] y=x1.toCharArray();
		int[] x=new int[x1.length()];
		int cnt=0;
		for(int i=0;i<x1.length();i++)
		{
			x[i]=Integer.parseInt(String.valueOf(y[i]));
			//System.out.println(x[i]);
			if(x[i]!=0 && n%x[i]==0)
			{
				//System.out.println(x[i]);
				cnt++;
			}
		}
		System.out.println(cnt);
		/*int[] y=new int[x1.length()];
		int n=0;
		for(int i=0;i<n;i++)
		{
			int x=in.nextInt();
			while(x>1)
			{
				y[n]=x%10;
				x=x/10;
				n++;
			}
			y[n]=x;
		}
	*/
        }
	}
}
