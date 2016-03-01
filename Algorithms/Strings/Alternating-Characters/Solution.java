//https://www.hackerrank.com/challenges/alternating-characters

import java.util.*;
import java.io.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int no=in.nextInt();
		for(int k=0;k<no;k++)
		{
			String str=in.next();
		char[] ch=str.toCharArray();
		//String str1=str.replace()
		char temp=ch[0];
		String str1=""+temp;
		for(int i=1;i<ch.length;i++)
		{
			if(temp!=ch[i])
			{
				temp=ch[i];
				str1=str1+ch[i];
			}
		}
		System.out.println(str.length()-str1.length());
		}
		

	}
}
