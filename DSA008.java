/*
 Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
Using Kandane's Algo.
 */
import java.io.*;

class DSA008 
{    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
        //size of array
        int n = Integer.parseInt(br.readLine().trim());
        int arr[] = new int[n];
        String inputLine[] = br.readLine().trim().split(" ");	    
		    //adding elements
	for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(inputLine[i]);
            }
		    Kadane obj = new Kadane();    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}

// } Driver Code Ends

class Kadane{
    
    // Function to find subarray with maximum sum
    // arr: input array
    // n: size of array
    int maxSubarraySum(int arr[], int n){
    int max_sf=Integer.MIN_VALUE, max_eh=0;
    for(int i = 0;i<n ;i++)
    {
        max_eh+=arr[i];
        if(max_eh>max_sf)
        {
            max_sf=max_eh;
        }
        if(max_eh<0)
        {
            max_eh=0;
        }
        
    }
    return max_sf;
    }

}
