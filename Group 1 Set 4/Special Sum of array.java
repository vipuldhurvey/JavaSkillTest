
public class solution {

	public static int sum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		int n = sum;
		while(sum > 9) {
			int ans = 0;
			while(sum > 0) {
				ans += sum % 10;
				sum = sum / 10;
			}
			sum = ans;
		}
		return sum;
	}
}
