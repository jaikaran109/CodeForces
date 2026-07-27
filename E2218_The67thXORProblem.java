package CodeForces;
import java.util.*;
class E2218_The67thXORProblem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-- > 0){
			int n = input.nextInt();
			int [] arr = new int[n];
			for(int i = 0 ; i < n ; i++) {
				arr[i] = input.nextInt();
			}
			
			int ans = 0;
			for(int i = 0 ; i < n ; i++) {
				for(int j = i + 1 ; j < n ; j++) {
					ans = Math.max(ans, arr[i] ^ arr[j]);
				}
			}
			System.out.println(ans);
		}

	}

}
