import java.util.*;

public class TwoDSort
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);

		int n=scan.nextInt();
		int[][] arr=new int[n][n];

		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=scan.nextInt();

		Arrays.sort(arr,1,4);

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
}

//WRONG