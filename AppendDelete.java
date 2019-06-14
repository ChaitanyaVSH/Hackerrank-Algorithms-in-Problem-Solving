import java.util.*;

public class AppendDelete
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		String s2=scan.next();
		int n=scan.nextInt();
		int min=Math.min(s1.length(),s2.length());
		int i=0,count=0;
		while(min-->0)
		{
			
			if(s1.charAt(i)==s2.charAt(i)){i++;
				count++;
			}
		}
		System.out.println(((s1.length()-count)+(s2.length()-count)<=n)?"Yes":"No");
	}
}