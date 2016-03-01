//https://www.hackerrank.com/challenges/make-it-anagram

import java.util.*;
class anag
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String[] s=new String[2];
		for(int i=0;i<2;i++)
			s[i]=in.next();
		int[][] a=new int[2][26];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<s[i].length();j++)
			{
				a[i][s[i].charAt(j)-'a']++;
			}
		}
		int count=0;
		for(int i=0;i<26;i++)
		{
			count=count+Math.abs(a[0][i]-a[1][i]);
		}
		System.out.println(count);
	}
}
