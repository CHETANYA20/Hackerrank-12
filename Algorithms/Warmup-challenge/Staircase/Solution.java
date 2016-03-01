//https://www.hackerrank.com/challenges/staircase

import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=(n-i))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("#");
				}


			}
			System.out.println();
		}
	}
}
