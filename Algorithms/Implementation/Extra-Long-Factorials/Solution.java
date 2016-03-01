//https://www.hackerrank.com/challenges/extra-long-factorials

import java.util.*;
import java.math.BigInteger;
class Solution
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		BigInteger sum=BigInteger.ONE;
		for(int i=n;i>0;i--)
		{
			sum=sum.multiply(BigInteger.valueOf(i));
		}
		System.out.println(sum);
	}
}
