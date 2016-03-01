//https://www.hackerrank.com/challenges/gem-stones



import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int N;
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		String s;
		int[] count = new int[26];
		int[] temp;
		for (int i = 0; i < N; i++) {
			temp = new int[26];
			s = in.next();
			for (char c : s.toCharArray()) {
				temp[c - 97] += 1;
				if (temp[c - 97] == 1)
					count[c - 97] += 1;
			}
			temp = null;
		}
		int sum = 0;
		for (int i = 0; i < 26; i++) {
			if (count[i] == N)
				sum += 1;
		}
	
		System.out.println(sum);
	}

}
