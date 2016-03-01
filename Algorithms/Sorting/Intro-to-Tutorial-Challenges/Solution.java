//https://www.hackerrank.com/challenges/tutorial-intro

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int v=in.nextInt();
        int s=in.nextInt();
        int[] a=new int[s];
        for(int i=0;i<s;i++)
            {
            int x=in.nextInt();
            if(x==v)
                {
                System.out.println(i);
                break;
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
