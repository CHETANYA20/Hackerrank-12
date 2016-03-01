//https://www.hackerrank.com/challenges/angry-professor

import java.io.*;
import java.util.Scanner;
class Solution
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			int x=in.nextInt();
			int y=in.nextInt();
			int count=0;
			for(int j=0;j<x;j++)
			{
				int z=in.nextInt();
				if(z<=0)
				{
					count++;
				}				
			}
			if(count>=y)
				{
					System.out.println("NO");
				}
				else
				{
					System.out.println("YES");
				}
		}
	}
}
