//https://www.hackerrank.com/challenges/sherlock-and-squares

import java.util.*;
import java.math.*;

class sqr
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int tt=in.nextInt();
		for(int i=0;i<tt;i++)
		{
			int a=in.nextInt();
			int b=in.nextInt();
			/*int max=0;
			if(a>b)
			{
				max=a;
			}
			else
			{
				max=b;
			}
			*/
			int b1=(int)Math.sqrt(b);
			int a1=(int)Math.sqrt(a);
			int count=0;
			for(int j=(a1-1);j<=(b1+1);j++)
			{
				if(Math.pow(j,2)>=a && Math.pow(j,2)<=b)
				{
					count++;
				}
				else
				{
					if(Math.pow(j,2)>b)
					{
						break;
					}
				}
			}
			System.out.println(count);
		}
	}
}
