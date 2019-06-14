import java.util.*;

public class ACM
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);

		int nos=scan.nextInt();
		int l=scan.nextInt();
		String[] s=new String[nos];
		
		int[] tmp=new int[l+1];
		int max=0;
		for(int i=0;i<nos;i++)
			s[i]=scan.next();
		
		for(int i=0;i<nos-1;i++)
		{
			for(int j=i+1;j<nos;j++)
			{
			char[] c1=s[i].toCharArray();
			char[] c2=s[j].toCharArray();
			int count=0;
			for(int k=0;k<c1.length;k++)
				if(Character.getNumericValue(c1[k])+Character.getNumericValue(c2[k])>=1)
					count++;
			if(max<count)
				max=count;	
			tmp[count]++;
			}
		}
		System.out.print(max+"\n"+tmp[max]);
			
	}
}