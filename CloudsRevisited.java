import java.util.*;

public class CloudsRevisited
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int e=100;
		int[] c=new int[n];
		
		for(int i=0;i<n;i++)
			c[i]=scan.nextInt();
		for(int i=0;i<n;i=i+k)
		{
			if(c[i]==0)
				e=e-1;
			else
				e=e-3;
		}
		System.out.println(e);
	}
}