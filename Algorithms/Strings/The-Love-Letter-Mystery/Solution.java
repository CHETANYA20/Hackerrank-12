//https://www.hackerrank.com/challenges/the-love-letter-mystery

import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int no=in.nextInt();
		for(int i=0;i<no;i++)
		{
			String s=in.next();
			int count=0;
			for(int j=0;j<s.length()/2;j++)
			{
				count+=Math.abs(s.charAt(j)-s.charAt(s.length()-1-j));
			}
			System.out.println(count);
		}
	}
}
