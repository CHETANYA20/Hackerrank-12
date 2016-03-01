//https://www.hackerrank.com/challenges/caesar-cipher-1

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        char[] ch=s.toCharArray();
        String str="";
        for(int i=0;i<ch.length;i++)
        {
        	if(Character.isLetter(ch[i]))
        	{
        		int y;
        		if(Character.isUpperCase(ch[i]))
        		{
        			y=((int)ch[i]-65)+k;
        			//System.out.println(y);
        			if(y>25)
        			{
        				y=y%26;
        				
        			}
        			y=y+65;
        			//System.out.println(y);
        			//z=y;
        		}
        		else
        		{
    				y=((int)ch[i]-97)+k;
    				//System.out.println("y:"+y);
    				if(y>25)
        			{
        				y=y%26;
        				
        			}
        			y=y+97;
        			//System.out.println(y);
          		}
          		char z=(char)y;
          		//System.out.println("z:"+z);
          		str=str+z;
        		//System.out.println(z);
        	}
        	else
        	{
        		str=str+ch[i];
        	}
        }
        System.out.println(str);
    }
}
