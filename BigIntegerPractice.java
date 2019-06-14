import java.util.*;
import java.math.*;

public class BigIntegerPractice
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter 2 big integers");
		BigInteger b1=scan.nextBigInteger();
		BigInteger b2=scan.nextBigInteger();
		BigInteger b3=new BigInteger("101314446794646463");

		System.out.println("add "+b1.add(new BigInteger("99999901314446794646463")));
		System.out.println("sub "+b1.subtract(b2).intValue());
		System.out.println("product "+b1.multiply(b2));
		System.out.println("division "+b1.divide(b2));
		System.out.println(b1+" "+b2);

		System.out.println(scan.nextBigInteger().max(scan.nextBigInteger()).isProbablePrime(100));
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("Enter array of bigintegers");
		BigInteger[][] arr=new BigInteger[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			arr[i][j]=scan.nextBigInteger();
		}

		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++)
			System.out.println(arr[i][j]);
	}
}

/*
Enter 2 big integers
1314654657987
1
add 99999901315761449304450
sub 1314654657986
product 1314654657987
division 1314654657987




Enter 2 big integers
1
12345678946546546465
add 99999901314446794646464
sub -2012018464
product 12345678946546546465
division 0
1 12345678946546546465
1
12345678946546546465
false
*/