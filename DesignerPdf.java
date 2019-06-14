import java.util.*;

public class DesignerPdf
{
	static int max;
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int[] data=new int[26];

		for(int i=0;i<26;i++)
			data[i]=scan.nextInt();

		String s=scan.next();

		for(int i=0;i<s.length();i++)
		{
			int b=((int)s.charAt(i))-97;
			//System.out.print(b+" ");

			if(data[b]>max)
				max=data[b];
		}

		System.out.println(max*s.length());
	}
}