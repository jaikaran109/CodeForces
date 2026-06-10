import java.util.*;
public class A116_Tram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int temp = 0;
		int ans = 0;
		while(n-- > 0) {
			int exit = input.nextInt();
			int enter = input.nextInt();
			
			temp -= exit;
			temp += enter;
			ans = Math.max(ans, temp);
			
		}
		System.out.println(ans);
	}

}
