import java.util.*;

public class ClosestNumbers
{
	public static void main(String a[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		Arrays.sort(arr);
		int min=Math.abs(arr[0]-arr[n-1]);
		int temp=0;
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
			{
				temp=Math.abs((arr[i]-arr[j]));
				if(temp<min)
					min=temp;
			}
			int temp2=0;
			TreeSet ts=new TreeSet();
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
			{
				temp2=Math.abs((arr[i]-arr[j]));
				if(min==temp2)
				{
					System.out.print(arr[i]+" "+arr[j]+" ");
				}
			}

	}
}