import java.util.Scanner;

public class Anagrams
{
	static boolean isAnagram(String A, String B)
	{
    // Complete the function 
    Boolean retValue = false;
    if(A != null && B != null) 
    {
        char [] arrayA = A.toLowerCase().toCharArray();
        char [] arrayB = B.toLowerCase().toCharArray();
        java.util.Arrays.sort(arrayA); 
        java.util.Arrays.sort(arrayB);
        retValue = java.util.Arrays.equals(arrayA, arrayB);
    }
    return retValue;
	}

	public static void main(String[] args)
	{
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }	
}