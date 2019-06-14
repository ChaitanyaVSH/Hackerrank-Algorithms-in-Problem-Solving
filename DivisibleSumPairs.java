import java.util.*;

public class DivisibleSumPairs
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int arr[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();

		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			if((arr[i]+arr[j])%k==0)
				count++;
			}
		}
		System.out.println(count);
	}
}