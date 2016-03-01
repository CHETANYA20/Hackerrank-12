//https://www.hackerrank.com/challenges/utopian-tree

import java.io.*;
import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			int h=1;
			int no=in.nextInt();
			for(int j=1;j<=no;j++)
			{
				if(j%2!=0)
				{
					h=2*h;
				}
				else
				{
					h++;
				}
			}
			System.out.println(h);
		}
	}
}
