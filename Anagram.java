import java.util.*;

public class Anagram
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int noq=scan.nextInt();
        String s="";
        int count=0;
        
        while(noq-->0)
        {
        	int[] c=new int[26];
        	count=0;
        	s=scan.next();
        if(!(s.length()%2==0))
            System.out.println("-1");
        else
        {
        	for(int i=0;i<s.length()/2;i++)
        		c[(int)s.charAt(i)-97]++;
        	
            for(int i=s.length()/2;i<s.length();i++)
        		c[(int)s.charAt(i)-97]--;
  
            
        	for(int i=0;i<26;i++)
        		count+=Math.abs(c[i]);
            System.out.println(count/2);

        }
        
        
        }
    }
}