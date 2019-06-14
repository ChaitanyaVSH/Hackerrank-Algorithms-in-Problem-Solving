import java.util.*;

public class CountingSort
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		int[] arr=new int[100];

		for(long l=0;l<n;l++)
			arr[scan.nextInt()]++;
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}