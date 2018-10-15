//https://www.hackerrank.com/challenges/flipping-bits

import java.util.*;
//import java.StringUtils;
import java.math.BigInteger;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);	
		int tt=in.nextInt();
		for(int k=0;k<tt;k++)
		{
			long n=in.nextLong();
			String x=Long.toBinaryString(n);
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<(32-x.length());i++)
			{
				sb.append("0");
			}
			sb.append(x);
			for(int i=0;i<32;i++)
			{
				if(sb.charAt(i)=='0')
				{
					sb.setCharAt(i,'1');
				}
				else
				{
					sb.setCharAt(i,'0');
				}
			}
			String x1=sb.toString();
			long abc=new BigInteger(x1,2).longValue();
			System.out.println(abc);
		}

	}
}
