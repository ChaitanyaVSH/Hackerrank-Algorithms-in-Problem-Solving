import java.util.*;

public class Dict_and_Maps
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String s="";
		String skey="";
		int phn=0;
		Map<String,Integer> mp=new HashMap<String,Integer>();

		for(int i=0;i<n;i++)
		{
			//System.out.println("Enter the name and number");
			s=scan.next();
			phn=scan.nextInt();

			mp.put(s,phn);
		}

		while(scan.hasNext())
		{
			//System.out.println("Enter the search key");
			skey=scan.next();
			System.out.println((mp.containsKey(skey))?skey+"="+mp.get(skey):"Not found");
		}

	}
}