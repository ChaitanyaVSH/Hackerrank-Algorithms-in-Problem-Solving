import java.util.*;

public class codechefmealJAVA
{
	public static void  main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int noft=scan.nextInt();
		while(noft-->0)
		{
			int[] arr=new int[26];
			int count=0;
			int n=scan.nextInt();
			scan.nextLine();
			String s="";
			for(int i=0;i<n;i++)
			{
				s=scan.nextLine();
				for(int j=0;j<s.length();j++)
					arr[(int)s.charAt(j)-97]++;	
			}
			while(1==1)
			{
			if(arr[2]>=2&&arr[4]>=2)
			{
				if(arr[14]>=1&&arr[3]>=1&&arr[7]>=1&&arr[5]>=1)
				{
					arr[2]=arr[2]-2;
					arr[4]=arr[4]-2;
					arr[14]=arr[14]-1;
					arr[3]=arr[3]-1;
					arr[7]=arr[7]-1;
					arr[5]=arr[5]-1;
					count++;
				}
			}
			else 
				break;
			}
			System.out.println(count);	
		}
	}
}