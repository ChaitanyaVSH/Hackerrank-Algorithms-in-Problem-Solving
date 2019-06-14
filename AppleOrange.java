import java.util.*;
public class AppleOrange
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int s=scan.nextInt();
		int t=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		int m=scan.nextInt();
		int n=scan.nextInt();
		int[] apples=new int[m];
		int[] oranges=new int[n];
		int applecount=0,orangecount=0;

		for(int i=0;i<m;i++){
			apples[i]=scan.nextInt();
			if(a+apples[i]>=s&&apples[i]+a<=t)
				applecount++;
		}
		
		for(int i=0;i<n;i++){
			oranges[i]=scan.nextInt();
			if(oranges[i]+b>=s&&oranges[i]+b<=t)
				orangecount++;
		}
		System.out.println(applecount+"\n"+orangecount);
	}
}