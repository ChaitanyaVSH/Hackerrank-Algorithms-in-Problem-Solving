import java.util.*;

public class CaesarCipher
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		String s=scan.nextLine();
		int k=scan.nextInt();

		/*for(int i=0;i<s.length();i++)
		{
			System.out.print(Integer.parseInt(String.valueOf((s.charAt(i)))));	//each character //gives error for letters, but integer value for numbers
		}
		
		for(int i=0;i<s.length();i++)
		{
			System.out.print((int)s.charAt(i));	//ASCII values
		}*/

		for(int i=0;i<s.length();i++)
		{
			int value=(int)(s.charAt(i));
			if((value>=65&&value<=90))
			{
				int a=value+k;
				while(a>90)
					a=a-26;					
				char c=(char)a;
				System.out.print(c);
			}
			else if((value>=97&&value<=122))
			{
				int a=value+k;
				while(a>122)
					a=a-26;
				char c=(char)a;
				System.out.print(c);
			}
			else
				System.out.print(s.charAt(i));
		}


	}
}