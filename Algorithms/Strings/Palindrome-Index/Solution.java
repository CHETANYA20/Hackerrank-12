//https://www.hackerrank.com/challenges/palindrome-index

import java.util.*;
class Solution
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int tt=in.nextInt();
		for(int k=0;k<tt;k++)
		{
			String str=in.next();
			String str1=new StringBuilder(str).reverse().toString();
			if(str.equals(str1))
			{
				System.out.println(-1);
			}
			else
			{
				for(int i=0;i<str.length()/2;i++)
				{
				if(str.charAt(i)!=str.charAt(str.length()-i-1))
				{
					String st=str.substring(0,i)+str.substring(i+1);
					String temp=new StringBuilder(st).reverse().toString();
					if(temp.equals(st))
					{
						System.out.println(i);
						break;
					}
					else
					{
						System.out.println(str.length()-i-1);	
						break;
					}
				}
				}	
			}
			
		}
	}
}
