import java.util.*;

public class ArrayPermutationGreedy
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int not=scan.nextInt();
        while(not-->0)
        {
            int n=scan.nextInt();long[] a=new long[n];long[] b=new long[n];
            long k=scan.nextLong();
            

            for(int i=0;i<n;i++)
                a[i]=scan.nextLong();
            Arrays.sort(a);
            for(int i=0;i<n;i++)
                b[i]=scan.nextLong();
            Arrays.sort(b);
            int count=0;
            for(int i=0,j=n-1;i<n&&j>=0;i++,j--)
            {

                if((a[i]+b[j])>=k)
                    count++;
            }
            System.out.println((count==n)?"YES":"NO");
        }
    }
}


//Got output , but better answers in discussions, #REFER