//https://www.hackerrank.com/challenges/missing-numbers

import java.util.*;
class Solution
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int[] hash=new int[10001];
		int[] a=new int[m];
		for(int i=0;i<m;i++)
		{
			a[i]=in.nextInt();
			hash[a[i]]++;
		}
		int n=in.nextInt();
		int[] b=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=in.nextInt();
			hash[b[i]]--;
		}
		TreeSet ts=new TreeSet(); 
		//System.out.println("Hash SEt value:");
		for(int i=1;i<10001;i++)
		{
			if(hash[i]!=0)
			{
				//System.out.println(i);
				ts.add(i);
			}
		}
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			int x=Integer.parseInt(it.next().toString());
			System.out.print(x+" ");
		}
	}
}
