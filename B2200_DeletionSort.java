import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		while(t-- > 0) {
			int n = input.nextInt();
			int[] arr = new int[n];

			for(int i = 0; i < n; i++) {
				arr[i] = input.nextInt();
			}

			boolean sorted = true;

			for(int i = 0; i < n - 1; i++) {
				if(arr[i] > arr[i + 1]) {
					sorted = false;
					break;
				}
			}

			if(sorted) {
				System.out.println(n);
			}else {
				System.out.println(1); // minimum chahiye na isiliye 1 , kyuki agr array unsorted h tb tm baki sare elements hta do uss perticular element ko chord kr jo problem create kr rha 
			}
		}
	}
}
