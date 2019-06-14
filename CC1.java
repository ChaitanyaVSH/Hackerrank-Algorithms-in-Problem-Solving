import java.util.*;

public class CC1
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);

		long n=scan.nextLong();
		long count=0;

		for(int i=1;i<=n;i++)
		{
			int  num=i;
			while(num>0)
			{
				num=num/10;
				count++;
			}
		}
		System.out.println(count);
	}
}