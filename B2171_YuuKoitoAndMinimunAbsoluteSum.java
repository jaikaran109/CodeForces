package CodeForces;


//Yuu is trying out the student council! Unfortunately, she is being forced to do clerical work ...
//Touko wants her to fill out the blanks in various student council documents.
//
//You are given a partially filled array of nonnegative integers a1, a2, ... , an, where blank
//elements are denoted with -1. You would like to fill in the blank elements with nonnegative
//integers, such that the absolute value of the sum of the elements in its difference array is
//minimized.
//
//More formally, let b be the array of length n - 1 such that b; = di+1 - ai for all
//1< i <n -1. Find the minimum possible value of |b1 + b2 + · . . + bn-1|, across all
//possible ways to fill in the blank elements of a.
//
//Additionally, output the array that achieves this minimum. If there are multiple such arrays,
//output the one that is lexicographically smallest*
//
//*For two arbitrary arrays c and d of length n, we say that c is lexicographically smaller than d if there exists a
//index i (1 < i < n) such that Cj = dj for all j < i, and c < di. In other words, c and d differ in at least one
//index, and at the first index at which they differ, Ci is smaller than di.
//Input
//The first line contains a single integer t (1 < t < 104) - the number of test cases.
//
//The first line of each test case contains a single integer n (2 < n < 2 - 105).
//
//The second line of each test case contains n integers, d1, a2, ... , an (-1 ≤ a; ≤ 106).
//It is guaranteed that the sum of n over all test cases does not exceed 2 . 105.
//
//Output
//For each test case, on the first line, output the minimum possible value of
//|b1 +b2 + ... + bn-1|. Then, on the second line, output n integers, the values of
//a1, a2, ... , an in the lexicographically smallest array achieving this minimum.


import java.util.*;

public class B2171_YuuKoitoAndMinimunAbsoluteSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            if (a[0] == -1 && a[n - 1] == -1) {
                a[0] = 0;
                a[n - 1] = 0;
            } else if (a[0] == -1) {
                a[0] = a[n - 1];
            } else if (a[n - 1] == -1) {
                a[n - 1] = a[0];
            }

            for (int i = 0; i < n; i++) {
                if (a[i] == -1) {
                    a[i] = 0;
                }
            }

            long minValue = Math.abs(a[n - 1] - a[0]);
            System.out.println(minValue);

            // Step 4: Print array
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
