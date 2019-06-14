import java.util.*;

class CutTheSticks
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[1001];

		for(int i=0;i<n;i++)
			arr[scan.nextInt()]++;

		int count=0;
		System.out.println(n);

		for(int i=1;i<1001;i++)
		{
			if(arr[i]!=0)
			{
				count+=arr[i];
				if(count==n)
					break;
				System.out.println(n-count);
			}
		}
	}
}

//The best code till now;