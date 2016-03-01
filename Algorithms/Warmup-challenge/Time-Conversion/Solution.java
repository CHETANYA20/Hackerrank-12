//https://www.hackerrank.com/challenges/time-conversion

import java.util.*;
class conv
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String time=in.next();
		char[] ch=time.toCharArray();
		char x=ch[ch.length-2];
		boolean stat;
		if(x=='A')
			stat=true;
		else
			stat=false;
		String str1="";
		String h=time.substring(0,2);
		int hr=Integer.parseInt(h);
		if(stat)
		{						
			int x1;
			if(hr==12)
			{
				x1=hr-12;
				str1=str1+x1;
				str1=str1+x1;
				str1=str1+time.substring(2,(ch.length-2));
			}
			else
			{
				x1=hr;
				str1=time.substring(0,(ch.length-2));
			}			
		}
		else
		{
			//String h=time.substring(0,2);
			//int hr=Integer.parseInt(h);
			//System.out.println(hr);
			int x1;
			if(hr!=12)
			{
				x1=12+hr;
			}
			else
			{
				x1=hr;
			}
			str1=str1+x1;
			str1=str1+time.substring(2,(ch.length-2));
			//str1=str1+":";
			/*for(int i=2;i<(ch.length-2);i++)
			{
				str1=str1+ch[i];
			}
			for(int i=0;i<ch.length-2;i++)
			{
				h=
			}*/
		}
		System.out.println(str1);
	}
}
