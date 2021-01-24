import java.util.*;
public class DSA04 {

   public static void sort012(int a[], int n){
   ArrayList<Integer> al=new ArrayList<>();
    for(int i=0;i<a.length;i++)
    {
        al.add(a[i]);
    }
    Collections.sort(al);
    for(int i=0;i<n;i++)
    {
        a[i]=al.get(i);
    }
    System.out.print(al);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sort012(a,n);
        
    }
    
}
