//https://www.hackerrank.com/challenges/sherlock-and-valid-string

import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int[] a=new int[26];
		for(int i=0;i<str.length();i++)
		{
			a[str.charAt(i)-'a']++;
		}
		List l=new ArrayList();
		for(int i=0;i<26;i++)
		{
			if(a[i]!=0)
			{
				
				l.add(a[i]);
			}
		}
		//System.out.println(l);
		int max=0;
		int elem=0;
		for(int i=0;i<l.size();i++)
		{
			int freq=Collections.frequency(l,l.get(i));
		//	System.out.println(freq);
			if(freq>max)
			{
				max=freq;
				elem=Integer.parseInt(l.get(i).toString());
			}
		}
		//System.out.println(elem);
		Arrays.sort(a);
		int minus=0;
		boolean stat=true;
		for(int i=a.length-1;a[i]!=0;i--)
		{
			if(a[i]>elem)
			{
				minus+=(a[i]-elem);
			}
			else if(a[i]<elem)
			{
				minus+=a[i];
			}
			if(minus>1)
			{
				stat=false;
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
		//System.out.println(minus);
	}
}
