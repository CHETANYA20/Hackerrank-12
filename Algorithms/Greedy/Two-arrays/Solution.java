//https://www.hackerrank.com/challenges/two-arrays

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		
		for (int i = 0; i < testCases; i++) {
			int N = scanner.nextInt();
			long k = scanner.nextLong();
			
			int a[] = new int[N];
			int b[] = new int[N];
			for (int j = 0; j < N; j++) {
				a[j] = scanner.nextInt();
			}
			
			for (int j = 0; j < N; j++) {
				b[j] = scanner.nextInt();
			}
			
			Arrays.sort(a);
			Arrays.sort(b);
			String out = "YES";
			for (int j = 0; j < N; j++) {
				if(a[j]+b[N-j-1]<k) {
					out="NO";
				}
			}
			
			System.out.println(out);
			
		}
	}


}
