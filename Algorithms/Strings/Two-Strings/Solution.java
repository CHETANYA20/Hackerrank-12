//https://www.hackerrank.com/challenges/two-strings

import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int k=0;k<n;k++)
		{
			String str1=in.next();
		String str2=in.next();
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		HashSet hs1=new HashSet();
	//	HashSet hs2=new HashSet();
		boolean stat=true;
		for(int i=0;i<ch1.length;i++)
		{
			hs1.add(ch1[i]);
		}
		for(int i=0;i<ch2.length;i++)
		{
			if(hs1.contains(ch2[i]))
			{
				stat=false;
				break;
			}
		}
		if(!stat)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		/*boolean stat=false;
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch2.length;j++)
			{
				if(ch1[i]==ch2[j])
				{
					stat=true;
					break;
				}
			}
		}
		if(stat)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}	
		}
		*/
		}
	}
}
