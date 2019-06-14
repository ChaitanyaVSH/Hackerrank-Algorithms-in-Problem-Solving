import java.util.*;
class ArraySum
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[1001];
		int temp,sum=0;
		for(int i=0;i<n;i++)
		{
			temp=scan.nextInt();
			sum+=temp;
			if(arr[temp]==0)
				arr[temp]=1;
		}
		int k;
		for(k=1;k<=1000;k++)
		{
			if(arr[k]==1)	
				if(k*n>sum)
					break;
		}
		System.out.println(k);
		for(int i=0;i<1001;i++)
			System.out.print(arr[i]+" ");
	}
}