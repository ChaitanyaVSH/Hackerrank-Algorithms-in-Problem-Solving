import java.util.*;

class ArraysUnionandIntersection
{
	public static void main(String args[])
	{
		int hold=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of arrays");
		int n=scan.nextInt();
		int[] c=new int[1000];
		int[] d=new int[1000];

		System.out.println("Enter the 1st array's elements");
		for(int i=0;i<n;i++)
		{
			hold=scan.nextInt();
			c[hold]++;
			d[hold]++;
		}
		
		System.out.println("Enter the 2nd array's elements");
		for(int i=0;i<n;i++)
		{
			hold=scan.nextInt();
			c[hold]++;
			if(d[hold]>0)d[hold]++;
		}

		for(int i=0;i<1000;i++)
		System.out.print(c[i]>0?i+" ":"");

		System.out.println();

		for(int i=0;i<1000;i++)
		System.out.print(d[i]==2?i+" ":"");
	}
}