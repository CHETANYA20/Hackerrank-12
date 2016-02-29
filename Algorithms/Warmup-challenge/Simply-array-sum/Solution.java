//https://www.hackerrank.com/challenges/simple-array-sum

import java.io.*;
import java.util.Scanner;
class Solution
    {
    public static void main(String args[])
        {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] x=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
            {
            x[i]=in.nextInt();
            sum+=x[i];
        }
        System.out.println(sum);
    }
}
