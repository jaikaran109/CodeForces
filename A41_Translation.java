//The translation from the Berland language into the Birland language is not an easy task.
//Those languages are very similar: a Berlandish word differs from a Birlandish word with the
//same meaning a little: it is spelled (and pronounced) reversely. For example, a Berlandish
//word code corresponds to a Birlandish word edoc. However, making a mistake during the
//"translation" is easy. Vasya translated the word s from Berlandish into Birlandish as t. Help
//him: find out if he translated the word correctly.
//
//Input
//The first line contains word s, the second line contains word t. The words consist of lowercase
//Latin letters. The input data do not contain unnecessary spaces. The words are not empty and
//their lengths do not exceed 100 symbols.
//
//Output
//If the word t is a word s, written reversely, print YES, otherwise print NO.


import java.util.*;
public class A41_Translation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		String t = input.next();
		
		if(s.length() != t.length()) {
			System.out.println("NO");
			return ;
		}
		
		for(int i = 0 ; i < s.length(); i++) {
			if(s.charAt(i) != t.charAt(t.length() - 1 - i)) {
				System.out.println("NO");
				return ;
			}
		}
		System.out.println("YES");
	}

}
