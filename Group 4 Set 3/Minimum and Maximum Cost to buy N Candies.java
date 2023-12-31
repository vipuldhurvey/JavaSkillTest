import java.util.*;

public class Solution {

	// Function to calculate minimum cost.	
    public static long minimumCost(int[] cost, int n, int k) 
	{
        // Write your code here.    
        Arrays.sort(cost);
    
        long minCost = 0;

     for(int i = 0; i < n; i++)
        {
         minCost += cost[i];

         // Dropping the right k elements as we get them for free.
         n = n - k;
     }
     return minCost;
    }
    
    // Function to calculate maximum cost.  
    public static long maximumCost(int[] cost, int n, int k) 
	{
        // Write your code here.    
        Arrays.sort(cost);
    
        long maxCost = 0;
        int total = 0;
        
        // Iterating cost array from last index.
        int i = n-1;
        
        while(total < n)
        {
            maxCost += cost[i];
            i--;
            
            // Taking the left k elements for free.
            total += (k + 1);
        }
     return maxCost;
    }

}






