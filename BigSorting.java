import java.util.*;
import java.math.*;

public class BigSorting
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String s[]=new String[scan.nextInt()];
		TreeSet ts=new TreeSet();
		for(int i=0;i<s.length;i++)
			ts.add(scan.next());

		
        
       /* Arrays.sort(s, new Comparator<String>(){
            public int compare(String a, String b){
                if(a.length() == b.length()) 
                   return a.compareTo(b);
                return a.length() - b.length();
        }});*/

		
		/*for(int i=0;i<s.length;i++)
			System.out.println(new BigInteger(s[i]));*/
			/*for(Object val:ts)
			System.out.println(val);*/
			System.out.println(ts);
	}
}