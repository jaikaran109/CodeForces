package CodeForces;


//Theatre Square in the capital city of Berland has a rectangular shape with the size n x m meters. On the occasion of the city's anniversary,
//a decision was taken to pave the Square with square granite flagstones. Each flagstone is of the size a x a.
//
//What is the least number of flagstones needed to pave the Square? It's allowed to cover the surface larger than the Theatre Square, but
//the Square has to be covered. It's not allowed to break the flagstones. The sides of flagstones should be parallel to the sides of the Square.
//
//Input
//The input contains three positive integer numbers in the first line: n, m and a (1 ≤ n, m, a ≤ 109).
//
//Output
//Write the needed number of flagstones.


import java.util.*;
public class A1_Theatre_Square {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextInt();
		long m = input.nextInt();
		long a = input.nextInt();
		
		long l = 0;
		long w = 0;
		
		if(n % a == 0)
			l += n / a;
		else
			l += n / a + 1;
		
		if(m % a == 0) 
			w += m / a;
		else
			w += m / a + 1;
		
		System.out.print(l*w);

	}

}
