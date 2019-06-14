import java.util.*;

public class BeautifulTriplets
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);

		int n=scan.nextInt();int count=0;
		int d=scan.nextInt();
		int[] ele=new int[n];
		
		 for(int i=0;i<n-2;i++)
            for(int j=i+1;j<n-1;j++)
            {
                if(ele[j]-ele[i]==d)
                {
                    for(int k=j+1;k<n;k++)
                        if((ele[k]-ele[j])==d)
                            count++;
                }  
            }
		System.out.println(count);
	}
}