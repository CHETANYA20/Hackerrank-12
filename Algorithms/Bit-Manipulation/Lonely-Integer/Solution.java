//https://www.hackerrank.com/challenges/lonely-integer

import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		int[] b=new int[(a[a.length-1])+1];
		//System.out.println("size:"+b.length);
		for(int i=0;i<n;i++)
		{
			b[a[i]]++;
		}
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==1)
			{
				System.out.println(i);
			}
		}
	}
}
