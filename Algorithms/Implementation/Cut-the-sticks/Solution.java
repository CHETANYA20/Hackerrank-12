//https://www.hackerrank.com/challenges/cut-the-sticks

import java.util.*;
class Solution
{
	static int mini(int[] a)
	{
		int min=0;
		for(int j=0;j<a.length;j++)
		{
			min=a[j];
			if(min>0)
			{
				for(int i=0;i<a.length;i++)
				{
					if(a[i]<min && a[i]>0)
					{
						min=a[i];
					}
				}			
				break;
			}		
		}
		return min;		
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = in.nextInt();
		}
		System.out.println(n);
		for(int i=0;i<n;i++)
		{
			int min=mini(a);
			int cnt=0;
			for(int j=0;j<n;j++)
			{
				a[j]=a[j]-min;
				if(a[j]>0)
				{
					//System.out.print(a[j]);
					cnt++;
				}
			}
			if(cnt>0)
			{
				System.out.println(cnt);
			}
			else
			{
				break;
			}
		}
	}
}
