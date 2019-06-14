import java.util.*;

public class CC2
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		long not=scan.nextLong();
		int x,y,total;

		while(not-->0)
		{
			x=scan.nextInt();
			y=scan.nextInt();

			total=(180-(2*x))/2;
			System.out.println(((total==y)?"RIGHT":"WRONG"));
		}
	}
}