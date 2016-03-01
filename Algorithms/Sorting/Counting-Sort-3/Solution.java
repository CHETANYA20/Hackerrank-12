//https://www.hackerrank.com/challenges/countingsort3

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[100];
        for(int i=0;i<n;i++)
            {
            a[in.nextInt()]++;
            String x=in.next();
        }
        int tot=0;
        for(int i=0;i<100;i++)
            {
          tot+=a[i];
            System.out.print(tot+" ");
        }
    }
}
