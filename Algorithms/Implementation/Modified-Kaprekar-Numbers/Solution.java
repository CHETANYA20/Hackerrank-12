//https://www.hackerrank.com/challenges/kaprekar-numbers

import java.util.*;
import java.math.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
         int count=0;
		for(int i=x;i<=y;i++)
		{
           
			if(i<5)
			{
				if(i==1)
				{
					System.out.print(1+" ");
                    count++;
				}
				
			}
			else
			{		
			BigInteger bi1;	
			String abc=String.valueOf(i);
			BigInteger bi=new BigInteger(abc);
			bi1=bi.pow(2);
			String str=String.valueOf(bi1);
			String xyz="";
			for(int k=str.length()-abc.length();k<str.length();k++)
			{
				xyz=xyz+str.charAt(k);
			}
			BigInteger bi2=new BigInteger(xyz);
			xyz="";
			for(int k=0;k<str.length()-abc.length();k++)
			{
				xyz=xyz+str.charAt(k);
			}
			BigInteger bi3=new BigInteger(xyz);
			BigInteger bi4;
			bi4=bi3.add(bi2);
			if(bi.compareTo(bi4)==0)
			{
				System.out.print(i+" ");
                count++;
			}
                
			}
            
		}
        if(count==0)
                    {
                    System.out.println("INVALID RANGE");
                }
	}
}
