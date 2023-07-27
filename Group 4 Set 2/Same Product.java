import java.util.*;

class Solution {
    
    public static int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int num1 = nums[i];
            for (int j = i + 1; j < length; j++) {
                int num2 = nums[j];
                int product = num1 * num2;
                int count = map.getOrDefault(product, 0) + 1;
                map.put(product, count);
            }
        }
        int tuples = 0;
        Set<Integer> keySet = map.keySet();
        for (int product : keySet) {
            int count = map.get(product);
            tuples += count * (count - 1) * 4;
        }
        return tuples;
    }
    
    public static void main(String[] args) {
        // Take input as instructed
        // Print output as instructed
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            int str=sc.nextInt();
            arr[i]=str;
        }
        
        System.out.println(tupleSameProduct(arr));
    }
}