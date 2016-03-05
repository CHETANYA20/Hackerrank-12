//https://www.hackerrank.com/challenges/pairs

import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int no=in.nextInt();
		int diff=in.nextInt();
		int[] a=new int[no];
		for(int i=0;i<no;i++)
		{
			a[i]=in.nextInt();
		}
		int cnt=0;
		Arrays.sort(a);
		for(int i=0;i<no;i++)
		{
			for(int j=i+1;j<no;j++)
			{
				if(a[i]-a[j]==diff || a[j]-a[i]==diff)
				{
					//System.out.println(a[i]+" "+a[j]);
					cnt++;
                    break;
				}
             
			}
		}
		System.out.println(cnt);
	}
}
