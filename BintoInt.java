import java.util.*;

public class BintoInt
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String bin=scan.next();
	 	char[] numbers = bin.toCharArray();
    	long result = 0;
    	for(int i=numbers.length - 1; i>=0; i--)
        if(numbers[i]=='1')
            result += Math.pow(2, (numbers.length-i - 1));
        System.out.println(result);
	}
}