import java.util.*;

public class ArrayManipulation
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();int[] arr=new int[n];
		int q=scan.nextInt();

		for(int i=0;i<q;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int sum=scan.nextInt();

			for(int j=a;j<=b;j++)
			{
				arr[j-1]+=sum;
			}
		}
		Arrays.sort(arr);
			System.out.println(arr[n-1]);
	}
}