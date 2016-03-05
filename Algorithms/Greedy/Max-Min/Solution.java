import java.util.Scanner;
import java.util.Arrays;
class Solution
{
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);

		int i;
        int diff = 0;

		int n=kb.nextInt();
		int k=kb.nextInt();

		int a[]=new int[n];

		for(i=0;i<n;i++)
		{
			a[i]=kb.nextInt();
		}

		Arrays.sort(a);

		for(i=0;i<=n-k;i++)
        {
            if(i==0)
            {
                diff=(a[i+k-1]-a[i]);
            }
            else if((a[i+k-1]-a[i])<diff)
            {
                diff=a[i+k-1]-a[i];
            }
        }
        System.out.println(diff);
	}
}
