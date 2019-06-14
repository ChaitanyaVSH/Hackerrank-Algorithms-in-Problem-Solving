import java.util.*;

public class BubbleSortInJava
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		int no=0;

		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{no=no+1;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array is sorted in "+no+" swaps.");
		System.out.println("First Element: "+arr[0]);
		System.out.println("Last Element: "+arr[n-1]);
	}
}