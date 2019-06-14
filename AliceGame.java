import java.util.*;
import java.math.*;

public class AliceGame
{
	public static void main(String args[])
	{
		Scanner scan=new  Scanner (System.in);
		int not=scan.nextInt();
		
		int count=1;
		boolean flag=false;
		while(not-->0)
		{	
			count=1;
			int n=scan.nextInt();
			for(int i=2;i<=n;i++)
			{
				flag=(BigInteger.valueOf(i).isProbablePrime(100));
				if(flag)
					count++;
			}
			System.out.println(((count%2==0)&&(n!=1))?"Alice":"Bob");
		}
	}
}

//refer www.cp-algorithms.com
//asked in PayPal