//https://www.hackerrank.com/challenges/sansa-and-xor

import java.util.Scanner;


public class Solution {

	private static void solve(Scanner sc)
	{
		final int N = sc.nextInt();
		long[] array = new long[N];
		for(int i = 0; i < N; ++i)
			array[i] = sc.nextLong();
		
		//If number of elements is even
		if((N&1) == 0)
		{
			System.out.println("0");
			return;
		}
		
		long answer = 0L;
		for(int i = 0; i < N; i+=2)
		{
			answer ^= array[i];
		}
		System.out.println(answer);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int T = sc.nextInt();
		for(int i = 0; i < T; ++i)
		{
			solve(sc);
		}
	}

}
