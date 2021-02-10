/**
 * Cyclically rotate an array by one.
   Given an array, rotate the array by one position in clock-wise direction.
 * 
 */
import java.util.*;
public class DSA007 extends Compute {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long N= sc.nextLong();
        long ar[]=new long[(int)N];
        for(int i =0;i<N;i++)
        {
            ar[i]=sc.nextLong();
        }
        Compute obj=new Compute();
        obj.rotate(ar,N);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<N;i++)
        {
            sb.append(ar[i]+" ");
        }
        System.out.println(sb);
    }
    
}
class Compute {
    
    public void rotate(long arr[], long n)
    {
        long ar[] = new long [(int)n];
        ar[0]=arr[(int)n-1];
        for(int i=0;i<n-1;i++)
        {
            ar[i+1]=arr[i];
        }
    
        for(int i = 0;i<n;i++)
        {
            arr[i]=ar[i];
        }
    }
}
