//https://www.hackerrank.com/challenges/encryption

import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String[] s=str.split(" ");
		String str1="";
		for(int i=0;i<s.length;i++)
		{
			str1=str1+s[i];
		}
		//System.out.println(str1);
		int r=(int)Math.floor(Math.sqrt(str1.length()));
		int c=(int)Math.ceil(Math.sqrt(str1.length()));
		//System.out.println(Math.sqrt(str1.length()));
		//System.out.println(r);
		//System.out.println(c);
		int mul=r*c;
		if(mul<str1.length())
		{
			r++;
			mul=r*c;
		}
		//System.out.println("size of array:"+mul);
		//System.out.println("length of string:"+str1.length());
		int diff=mul-str1.length();
		if(mul!=str1.length())
		{
			for(int k=0;k<diff;k++)
			{
				str1=str1+"0";
			}
		}
		//System.out.println("length of string:"+str1.length());
		//System.out.println(str1.length());
		char[] x=str1.toCharArray();
		char[][] ch=new char[r][c];
		int v=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				ch[i][j]=x[v];
				//System.out.print(ch[i][j]);
				v++;
			}
			//System.out.println();
		}
		for(int j=0;j<c;j++)
		{
			String a="";
			for(int i=0;i<r;i++)
			{
				if(!Character.isDigit(ch[i][j]))
				{
					a=a+ch[i][j];
				}				
			}
			System.out.print(a+" ");
		}
	}
}
