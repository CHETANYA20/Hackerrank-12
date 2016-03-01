//https://www.hackerrank.com/challenges/pangrams

import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String str1=str.toLowerCase();
		//System.out.println(str1);
		char[] ch=str1.toCharArray();
		TreeSet ts=new TreeSet();
		for(int i=0;i<ch.length;i++)
		{
            if(Character.isLetter(ch[i]))
			ts.add(ch[i]);
		}
	//	ts.add("t");
	//	ts.add("t");
	//	ts.add("T");
		//System.out.println(ts);
		if(ts.size()==26)
		{
			System.out.println("pangram");
		}
		else
		{
			System.out.println("not pangram");
		}

	}
}
