import java.util.*;
public class DSA05 {

    public static void main(String[] args) {
        int ar[]={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        NegativeSort(ar);
    }
    public static void NegativeSort(int ar[])
    {
        int j=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<0)
            {
                if(i!=j)
                {
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
                j++;
            }
        }
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(" "+ar[i]);
        }
    }
    
}
