//https://www.hackerrank.com/challenges/find-median

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int[] a=new int[in.nextInt()];
        for(int i=0;i<a.length;i++)
            a[i]=in.nextInt();
        Arrays.sort(a);
        System.out.println(a[a.length/2]);
    }
}
