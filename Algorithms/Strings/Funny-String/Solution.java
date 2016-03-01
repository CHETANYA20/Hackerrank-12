//https://www.hackerrank.com/challenges/funny-string

import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int tt=in.nextInt();
		for(int j=0;j<tt;j++)
		{
			String str=in.next();
			String sb=new StringBuilder(str).reverse().toString();
			//System.out.println(sb);
			Boolean stat=true;
			for(int i=1;i<str.length();i++)
			{
				int a=Math.abs(str.charAt(i)-str.charAt(i-1));
				int b=Math.abs(sb.charAt(i)-sb.charAt(i-1));
				//System.out.println(Math.abs(str.charAt(i))-Math.abs(str.charAt(i-1)));
				//System.out.println(Math.abs(sb.charAt(i))-Math.abs(sb.charAt(i-1)));
				if(a!=b)
				{
					stat=false;
					break;
				}
			}
			//System.out.println(stat);
			System.out.println((stat==true)?"Funny":"Not Funny");
		}
	}
}
