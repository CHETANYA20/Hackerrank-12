//https://www.hackerrank.com/challenges/the-time-in-words

import java.util.*;
class timewords
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int h=in.nextInt();
		int m=in.nextInt();
		String[] time={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","quarter","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"};

		if(m==0)
		{
			System.out.println(time[h-1]+" o' clock");
		}
        else if(m==15)
            {
           System.out.println("quarter past "+time[h-1]);
        }
		else if(m<30)
		{
			String str="";
			str=str+time[m-1];
			if(m<10)
			{
				str=str+" minute ";
			}
			else
			{
				str=str+" minutes ";
			}
			str=str+"past "+time[h-1];
			System.out.println(str);
		}
        
		else if(m==30)
		{
			System.out.println("half past "+time[h-1]);
		}
		else if(m==45)
		{
			System.out.println("quarter to "+time[h]);
		}
		else
		{
			//if((60-m)>9)
			
				System.out.println(time[60-m-1]+" minutes to "+time[h]);
			
		}
	}
}
