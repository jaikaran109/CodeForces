import java.util.*;
public class A110_NearlyLuckyNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();

		int cnt = 0;

		while (n > 0) {
		    long digit = n % 10;

		    if (digit == 4 || digit == 7) {
		        cnt++;
		    }

		    n /= 10;
		}
		
		if(cnt == 0) {
			System.out.println("NO");
			return;
		}
		int temp = cnt;
		boolean lucky = true;

		while (temp > 0) {
		    int d = temp % 10;

		    if (d != 4 && d != 7) {
		        lucky = false;
		        break;
		    }

		    temp /= 10;
		}
		
		if(lucky) System.out.println("YES");
		else System.out.println("NO");

	}

}
