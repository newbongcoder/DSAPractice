import java.util.*;
public class DSA03 {
    public static int kthSmallest(int[] ar, int l, int r, int k)
    {ArrayList <Integer> al =new ArrayList<>();
    for(int i=0;i<ar.length;i++)
    {
        al.add(ar[i]);
    }
    Collections.sort(al);
    int result = al.get(k-1);
    return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T =sc.nextInt();
         while(T-->0)
         {
             int n = sc.nextInt();
             int arr[]=new int[n];
             for(int i= 0 ;i<n;i++)
             {
                 arr[i]=sc.nextInt();
             }
             int k = sc.nextInt();
             System.out.println(kthSmallest(arr,0,n-1,k));
         }
    }
    
}
