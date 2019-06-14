import java.util.*;

public class BonAppetit
{static int sum;
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int b=scan.nextInt();
		int[] items=new int[n];
		

		for(int i=0;i<n;i++)
		{
			items[i]=scan.nextInt();
			if(i!=b)
				sum+=items[i];
		}

		int c=scan.nextInt();
		System.out.println((c==(sum/2)?"Bon Appetit":(c-(sum/2))));

	}
}