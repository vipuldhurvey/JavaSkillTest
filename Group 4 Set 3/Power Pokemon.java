import java.util.*;

public class Solution {


	public static void main(String[] args) {
		/* 
			* Your class should be named Solution.
			* Read input as specified in the question.
			* Print output as specified in the question.
			* Write your code here
		 */

		 Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] b = new int[a];
        int n = b.length;
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
        System.out.print(countPairs(b));

    }

    static int mod = 1000000007;

    public static int countPairs(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        long res = 0;
        for (int num : arr) {
            int power = 1;
            for (int i = 0; i < 22; i++) {
                if (map.containsKey(power - num)) {
                    res += map.get(power - num);
                    res %= mod;
                }
                power *= 2;
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return (int) res;

	}

}

