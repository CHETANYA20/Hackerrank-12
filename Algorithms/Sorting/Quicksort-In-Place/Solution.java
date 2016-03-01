//https://www.hackerrank.com/challenges/quicksort3

import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in=new Scanner(System.in);
    	int N=in.nextInt();
    	int ar[]=new int[N];
    	for(int i=0;i<N;i++)
    		ar[i]=in.nextInt();
    	quickSort(ar,N);
    	in.close();
    }

	private static void quickSort(int[] ar, int n) {
		// TODO Auto-generated method stub
		int start=0;
		int end=n-1;
		partition(ar,start,end);
	}

	private static void partition(int[] ar, int start, int end) {
		// TODO Auto-generated method stub
		if(end-start>0)
		{
		int i=0;
		int j=0;
		int pivot=ar[end];
		while(j<end)
		{
			if(ar[j]<pivot)
			{
				int temp=ar[j];
				ar[j]=ar[i];
				ar[i]=temp;
				i++;
			}
			j++;
		}
		ar[end]=ar[i];
		ar[i]=pivot;
		printArray(ar);
		System.out.println();
		if(end-start>1)
			{	
			partition(ar,start,i-1);
			partition(ar,i+1,end);
			}
		}
	}

	private static void printArray(int[] ar) {
		// TODO Auto-generated method stub
		int len=ar.length;
		for(int i=0;i<len;i++)
			System.out.print(ar[i]+" ");
	}
}
