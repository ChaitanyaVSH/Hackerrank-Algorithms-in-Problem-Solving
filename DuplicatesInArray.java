import java.util.*;

public class DuplicatesInArray
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),t=0;
		TreeSet ts=new TreeSet();

		for(int i=0;i<n;i++)
		{
			t=scan.nextInt();
			if(!ts.add(t))
				System.out.println(t+" is the duplicate");
			else
				System.out.println(ts.add(t));			//ONCE CHECK HERE
		}
	}
}