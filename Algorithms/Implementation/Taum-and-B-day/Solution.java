//https://www.hackerrank.com/challenges/taum-and-bday

import java.util.*;
class Solution
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int test=in.nextInt();
		for(int i=0;i<test;i++)
		{
			long black=(long)in.nextInt();
			long white=(long)in.nextInt();
			long b_price=(long)in.nextInt();
			long w_price=(long)in.nextInt();
			long conv=(long)in.nextInt();
			long act=(black*b_price)+(white*w_price);
			long plan1conv=w_price+conv;
			long plan2conv=b_price+conv;
			//System.out.println("conver1: "+plan1conv);
			long plan1=(black*plan1conv)+(white*w_price);
			long plan2=(black*b_price)+(white*plan2conv);
			//System.out.println(act);
			//System.out.println(plan1);
			//System.out.println(plan2);

            long[] price=new long[3];
            price[0]=act;
            price[1]=plan1;
            price[2]=plan2;
            Arrays.sort(price);
            System.out.println(price[0]);
			/*if(plan1<plan2 && plan1<act)
			{
				
			}
			else if(plan2<plan1 && plan2<act)
			{
				System.out.println(plan2);
			}
			else
			{
				System.out.println(act);
			}*/
		}
	}
}
