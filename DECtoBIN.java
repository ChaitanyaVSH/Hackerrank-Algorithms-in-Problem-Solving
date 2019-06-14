import java.util.*;

class DECtoBIN
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter decimal ");
		int dec=scan.nextInt();
		String bin="";
		int mod=0;

		while(dec>0)
		{
			mod=dec%2;
			bin=mod+bin;
			dec=dec/2;
		}
		System.out.println(bin);


		System.out.println("======BINARY TO DECIMAL======");
		System.out.println("Enter binary");
		String binn=scan.next();
		double decc=0;
		int i=0;
		int j=binn.length()-1;
		while(j>=0)
		{
			decc=decc+(Character.getNumericValue(binn.charAt(j--))*Math.pow(2,i++));
			decc=decc*10;
		}
		System.out.println(dec);
	}
}