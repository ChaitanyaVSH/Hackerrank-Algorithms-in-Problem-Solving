import java.util.*;
public class BreakingRecords
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];

		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}

		int highest=arr[0],lowest=arr[0];
		int high=0,low=0;

		for(int i=0;i<n;i++)
		{
			if(arr[i]>highest)
			{
				high++;
				highest=arr[i];
			}
			if(arr[i]<lowest)
			{
				low++;
				lowest=arr[i];
			}
		}
		System.out.println(high+" "+low);

	}

}