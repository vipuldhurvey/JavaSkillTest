import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		int n , count = 0 , a,b,c, sum = 0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		a = n;
		c = n;
		while(a > 0) {
			a = a / 10;
			count++;
		}
		while(n > 0) {
			b = n % 10;
			sum = (int)(sum + Math.pow(b , count));
			n = n / 10;
		}
		if(sum == c) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}


