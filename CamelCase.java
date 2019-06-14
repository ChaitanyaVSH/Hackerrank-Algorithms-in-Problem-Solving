/*
Find the total no. of words in a given sentence
*/
import java.util.*;

public class CamelCase
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
			if(((int)s.charAt(i))<95)
			{
				//System.out.print(s.valueOf(s.charAt(i))+" ");
				count++;
			}
			
		System.out.println(count+1);
	}
}
/*
import java.util.*;

public class Solution
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
            if(((int)s.charAt(i))<95)
            {
                //System.out.print(s.valueOf(s.charAt(i))+" ");
                count++;
            }
            
        System.out.println(count+1);
    }
}*/