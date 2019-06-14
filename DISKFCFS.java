import java.util.*;

public class DISKFCFS
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no. of cylinders");
		int n=scan.nextInt();

		int[] cyl=new int[n];

		for(int i=0;i<n;i++)
			cyl[i]=scan.nextInt();

		System.out.println("Enter current servicing point");
		int cur=scan.nextInt();

		int temp=Math.abs(cur-cyl[0]);
		System.out.print(temp+" ");
		for(int i=1;i<n;i++)
		{
			temp+=Math.abs(cyl[i]-cyl[i-1]);
			System.out.print(temp+" ");
		}
		
		System.out.println(temp);
	}
}