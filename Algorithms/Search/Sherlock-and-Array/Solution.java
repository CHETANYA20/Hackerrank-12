//https://www.hackerrank.com/challenges/sherlock-and-array

import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int tt=in.nextInt();
		for(int i=0;i<tt;i++)
		{
			int no=in.nextInt();
			int[] a=new int[no];
			int sum=0;
			for(int j=0;j<no;j++)
			{
				a[j]=in.nextInt();
				sum=sum+a[j];
			}
			//Arrays.sort(a);
			int right=0;
			//sum=sum-a[a.length-1];
			boolean stat=false;
			for(int j=a.length-1;j>=0;j--)
			{
				//System.out.println(a[j]);
				if(j!=a.length-1)
					right=right+a[j+1];
				//if(j!=0)
					sum=sum-a[j];
				//System.out.println(a[j]+": right:"+right+" left:"+sum);
				if(sum==right)
				{
					stat=true;
					break;
				}
			}
			if(stat)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}
