import java.util.Scanner;
public class DSA02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ar[] =new int[n];
        for(int i = 0;i< n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int max,min,i;
        if(n%2==0)// checks whether the size of the array is even or odd.
        {
            if(ar[1]<ar[0])
            {
                min=ar[1];
                max=ar[0];
            }
            else
            {
                min=ar[0];
                max=ar[1];
            }
            i=2;
        }
        else
        {
            max=ar[0];
            min=ar[0];
            i=1;
        }
        
        int count=0;
        while(i<n-1) // the loop iterates till the value of i is less than n-1
        {
            if(ar[i]<ar[i+1])// compares between consecutive pairs
            {
                count++;
                if(ar[i]<min)// checks if the value is less than variable min.
                {
                    min=ar[i];
                }
                if(ar[i+1]>max)
                {
                    max=ar[i+1];
                }
            }
            else
            {
                count++;
                if(ar[i]>max)
                {
                    max=ar[i];
                }
                if(ar[i+1]<min)
                {
                    min=ar[i+1];
                }
            }
            i+=2;
        }
        System.out.println("The maximum value is the array is : "+max+
                "\nThe minimum value of the array is : "+min+"\n"
                        + "was found in "+count+" iterations");
    } 
}
