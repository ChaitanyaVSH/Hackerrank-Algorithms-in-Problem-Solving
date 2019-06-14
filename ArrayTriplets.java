import java.util.*;

public class ArrayTriplets
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);

		int n=scan.nextInt();
		int k=scan.nextInt();
		long[] arr=new long[n];
		int count=0;
		long temp=0;

		for(int i=0;i<n;i++)
			arr[i]=scan.nextLong();
		
		for(int i=0;i<n;i++)
		{
			temp=arr[i];
			if(temp<k)
				count++;
			for(int j=i+1;j<n;j++)
			{
				temp=temp^arr[j];
				if(temp<k)
					count++;
			}
		}
		System.out.println("\t"+count);

	}
}