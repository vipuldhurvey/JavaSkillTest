import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long maxS=Integer.MIN_VALUE;
		long curSum=0;
		for(int i=0;i<arr.length;i++){
			curSum+=arr[i];
			if(curSum<=0){
				curSum=0;
			}else{
				if(curSum>maxS){
					maxS=curSum;
				}
			}
		}
		if(maxS==Integer.MIN_VALUE){
			return 0;
		}else
		return maxS;
	}

}
