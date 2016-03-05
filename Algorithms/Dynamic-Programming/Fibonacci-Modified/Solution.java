//https://www.hackerrank.com/challenges/fibonacci-modified

import java.util.*;
import java.math.BigInteger;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		BigInteger a=BigInteger.valueOf(in.nextInt());
		BigInteger b=BigInteger.valueOf(in.nextInt());
		int n=in.nextInt();
		for(int i=2;i<n;i++)
		{
			BigInteger x=b.pow(2).add(a);
			a=b;
			b=x;
		}
		System.out.println(b);
	}
}
