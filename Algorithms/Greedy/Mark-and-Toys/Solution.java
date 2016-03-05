//https://www.hackerrank.com/challenges/mark-and-toys

import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int amnt=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		int cnt=0,sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
			cnt++;
			if(sum>amnt)
			{
				cnt--;
				sum=sum-a[i];
				break;
			}
		}
		System.out.println(cnt);
	}
}
