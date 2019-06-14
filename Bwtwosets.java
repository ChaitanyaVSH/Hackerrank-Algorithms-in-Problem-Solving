/*import java.util.*;

public class Bwtwosets
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();int[] a1=new int[n1];
		int n2=scan.nextInt();int[] a2=new int[n2];

		for(int i=0;i<n1;i++)
			a1[i]=scan.nextInt();
		for(int i=0;i<n2;i++)
			a2[i]=scan.nextInt();
		Arrays.sort(a1);
		Arrays.sort(a2);

		int min=((a1[0]<a2[0])?a1[0]:a2[0]);
		int max=((a1[n1-1]>a2[n2-1])?a1[n1-1]:a2[n2-1]);
		int count1=0,count2=0;
		int mc=0;

		for(int i=min;i<=max;i++)
		{
			for(int j=0;j<n1;j++)
			{
				if(i%a1[j]==0)
					count1++;
				
			}
			for(int k=0;k<n2;k++)
			{
				if(a2[k]%i==0)
					count2++;
			}
			if((count1==n1)&&(count2==n2))
				mc++;
		}
		System.out.println(mc);

	}
}*/