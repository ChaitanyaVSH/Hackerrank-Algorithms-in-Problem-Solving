import java.util.*;

public class DayOfProgrammer
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		 System.out.println(((n%4==0))?"12.09."+n:"13.09."+n);
		 //System.out.println((n%400==0)?"12.09."+n:"13.09."+n);
	}
}