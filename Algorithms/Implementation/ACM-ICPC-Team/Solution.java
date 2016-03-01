//https://www.hackerrank.com/challenges/acm-icpc-team

import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int t=in.nextInt();
		int[][] a=new int[n][t];
		for(int i=0;i<n;i++)
		{
			String str=in.next();
			char[] ch=str.toCharArray();
			for(int j=0;j<t;j++)
			{
				String s=ch[j]+"";
				a[i][j]=Integer.parseInt(s);
			}
		}
		int max=0,count1=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int count=0;
				//System.out.println(i+","+j);
				for(int k=0;k<t;k++)
				{
					if(a[i][k]==1 || a[j][k]==1)
					{
						if(i!=j)
						{
							count++;
						}
					}
				}
				//System.out.println("count:"+count);
				if(max==count)
				{
					count1++;
				}
				if(max<count)
				{
					max=count;
					count1=0;
				}
				
			}
		}
		System.out.println(max);
		System.out.println(count1+1);
	}
}
