//https://www.hackerrank.com/challenges/flipping-bits

import java.util.*;
//import java.StringUtils;
import java.math.BigInteger;
class Solution
{
	/*static long dec(String x)
	{
		int v=0;
		long sum=0;
		System.out.println(x);
		for(int i=x.length()-1;i>=0;i--)
		{
			System.out.print(i+" : ");
			int temp=(int)Math.pow(2,v);
			v++;
			char ch=x.charAt(i);
			String t=ch+"";
			int temp1=(Integer.parseInt(t))*temp;
			
			sum=sum+temp1;
			System.out.println(temp1+" "+sum);
		}
		System.out.println(sum);
		return sum;
	}*/
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);	
		int tt=in.nextInt();
		for(int k=0;k<tt;k++)
		{
			long n=in.nextLong();
			//String x=StringUtils.leftPad(Integer.toBinaryString(n), 32, '0');
			//binary(n);
			//System.out.println(x);
			//System.out.println(Integer.toBinaryString(n));
			String x=Long.toBinaryString(n);
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<(32-x.length());i++)
			{
				sb.append("0");
			}
			sb.append(x);
			//System.out.println(sb);
			//char[] ch=sb.toCharArray();
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
			//long arun=dec(x1);
			long abc=new BigInteger(x1,2).longValue();
			System.out.println(abc);
			//System.out.println(arun);
		}

	}
}
