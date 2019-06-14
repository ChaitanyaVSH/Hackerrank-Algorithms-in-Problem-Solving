import java.util.*;

public class AngryProf
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{	
			int count=0;
			int n=scan.nextInt();
			int k=scan.nextInt();
			
			for(int j=0;j<n;j++)
			{
				int x=scan.nextInt();
				if(x<=0)
					count++;
			}
			if(count>=k)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}