//https://www.hackerrank.com/challenges/anagram

import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int no=in.nextInt();
		for(int i=0;i<no;i++)
		{
			String str=in.next();
			if(str.length()%2==0)
			{
				String[] s=new String[2];
				s[0]=str.substring(0,str.length()/2);
				s[1]=str.substring(str.length()/2,str.length());	
				int[][] a=new int[2][26];
				for(int j=0;j<2;j++)
				{
					for(int k=0;k<s[j].length();k++)
					{
						a[j][s[j].charAt(k)-'a']++;
					}
				}
				int count=0;
				for(int j=0;j<26;j++)
				{
					count=count+Math.abs(a[0][j]-a[1][j]);
				}
				System.out.println(count/2);
			}
			else
			{
				System.out.println(-1);
			}			
			//System.out.println(s1+"  "+s2);
		}
	}
}
