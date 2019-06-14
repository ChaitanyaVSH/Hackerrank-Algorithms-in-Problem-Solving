import java.util.*;

public class BDays
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		int k=scan.nextInt();
		int reverse=0;
		int count=0;
		for(int i=m;i<=n;i++)
		{
			int number=i;reverse=0;
			int temp=i;
			while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
       		}
       		
       		if((double)Math.abs(temp-reverse)/k-Math.abs(temp-reverse)/k==0)		
       			count++;
		}
		System.out.println(count);
		
	}
}