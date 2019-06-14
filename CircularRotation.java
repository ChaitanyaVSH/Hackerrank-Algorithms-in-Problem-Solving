import java.util.*;

public class CircularRotation
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();int[] arr=new int[n];
		int k=scan.nextInt();k=k%n;
		int q=scan.nextInt();
		int temp=0;
		int qq=0;
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();

		for(int i=0;i<q;i++)
		{
			qq=scan.nextInt();
			temp=qq-k;
			if(temp<0)
				temp+=n;
		System.out.println(arr[temp]);
		}

	}
}