import java.util.*;
public class Dist
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];

		TreeSet ts=new TreeSet();

		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}

		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
					{
						ts.add(Math.abs(i-j));
						//System.out.println(i+" "+j);
					}

			}
		}
		 System.out.println((ts.size()!=0)?ts.first():"-1");
	}
}
/*We define the distance between two array values as the number of indices between the two values. Given , find the minimum distance between any pair of equal elements in the array. If no such value exists, print .

For example, if , there are two matching pairs of values: . The indices of the 's are  and , so their distance is . The indices of the 's are  and , so their distance is .

Input Format

The first line contains an integer , the size of array . 
The second line contains  space-separated integers .

Constraints

Output Format

Print a single integer denoting the minimum  in . If no such value exists, print .

Sample Input

6
7 1 3 4 1 7

Sample Output

3

*/