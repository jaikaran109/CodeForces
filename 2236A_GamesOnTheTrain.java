package CodeForces;
import java.util.*;
public class A2236_GamesOnTheTrain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-- > 0) {
			int n = input.nextInt();
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for(int i = 0 ; i < n ; i++) {
				int x = input.nextInt();
				if(x > max) max = x;
				if(x < min) min = x;
			}
			System.out.println(max - min + 1);
		}

	}

}
