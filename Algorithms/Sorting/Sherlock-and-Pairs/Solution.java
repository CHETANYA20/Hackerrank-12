//https://www.hackerrank.com/challenges/sherlock-and-pairs

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int T,N;
        Scanner in=new Scanner(System.in);
        T=in.nextInt();
        while(T-->0){
            N=in.nextInt();
            int[] a=new int[N];
            for(int i=0;i<N;i++){
                a[i]=in.nextInt();
            }
            Arrays.sort(a);
            long count=0,pair=0;
            for(int i=0;i<N-1;i++){
                count=0;
                while(i<N-1 && a[i]==a[i+1]){
                    count++;
                    i++;
                }
                pair+=count*(count+1);
            }
            System.out.println(pair);
        }
    }
}
