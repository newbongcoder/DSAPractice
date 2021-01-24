import java.util.*;
public class DSA01 {
    public static void main(String[] args) {
       
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList <Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            al.add(sc.nextInt());
        }
                Collections.reverse(al);
                System.out.println(al);
        
        
    }
}
