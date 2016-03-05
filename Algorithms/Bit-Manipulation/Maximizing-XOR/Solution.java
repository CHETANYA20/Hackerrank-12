//https://www.hackerrank.com/challenges/maximizing-xor

import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int l=in.nextInt();
		int r=in.nextInt();
		int max=Integer.MIN_VALUE;
		for(int i=l;i<=r;i++)
		{
			for(int j=i;j<=r;j++)
			{
				if((i^j)>max)
				{
					max=i^j;
				}
			}
		}	
		System.out.println(max);
	}
}
