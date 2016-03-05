//https://www.hackerrank.com/challenges/almost-sorted

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Solution5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] d = new int[n];
		int[] sorted = new int[n];
		for(int i = 0; i < n; i++) {
			d[i] = in.nextInt();
			sorted[i] = d[i];
		}
		Arrays.sort(sorted);
		ArrayList<Integer> diff = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			if(d[i] != sorted[i]) {
				diff.add(i);
				if(diff.size() == 3) {
					break;
				}
			}
		}
		if(diff.size() == 2) {
			System.out.println("yes");
			System.out.println("swap " + (diff.get(0) + 1) + " " + (diff.get(1) + 1));
		} else {
			int first = -1;
			int last = Integer.MAX_VALUE;
			for(int i = 0; i < n; i++) {
				if(d[i] != sorted[i]) {
					if(first == -1) {
						first = i;
					}
					last = i;
				}
			}
			if(first == -1) {
				System.out.println("no");
			} else {
				boolean works = true;
				for(int i = 0; i < last - first; i++) {
					if(d[first + i] != sorted[last - i]) {
						works = false;
						break;
					}
				}
				if(works) {
					System.out.println("yes");
					System.out.println("reverse " + (first + 1) + " " + (last + 1));
				} else {
					System.out.println("no");
				}
			}
		}
	}
}
