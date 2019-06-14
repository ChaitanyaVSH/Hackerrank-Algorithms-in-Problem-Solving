import java.util.*;

public class BitwiseAND
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0)
		{
			int A=scan.nextInt();
			int K=scan.nextInt();
			int max=0;
			
			for(int i=1;i<A;i++)
			{
				for(int j=i+1;j<=A;j++)
				{
					if((i&j)<K&&(i&j)>max)
						max=i&j;
				}
			}
			System.out.println(max);
		}
	}
}