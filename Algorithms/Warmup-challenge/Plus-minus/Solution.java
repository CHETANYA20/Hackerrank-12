//https://www.hackerrank.com/challenges/plus-minus

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
              DecimalFormat df = new DecimalFormat("#.######");
        double cnt1=0;
        double cnt2=0;
        double cnt3=0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]>0)
            	cnt1++;
            else if(arr[arr_i]<0)
            	cnt2++;
            else
            	cnt3++;
        }
        System.out.println(df.format(cnt1/n));
        System.out.println(df.format(cnt2/n));
        System.out.println(df.format(cnt3/n));
    }
}

