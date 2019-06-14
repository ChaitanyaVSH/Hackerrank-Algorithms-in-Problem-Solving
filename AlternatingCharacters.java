import java.util.*;

public class AlternatingCharacters
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int count;
		int t=scan.nextInt();
		while(t-->0)
		{count=0;
			String s=scan.next();
			for(int i=0;i<s.length()-1;i++)
			{
			if(s.charAt(i)==s.charAt(i+1))
				count++;
			}
			System.out.println(count);
		}
	}
}