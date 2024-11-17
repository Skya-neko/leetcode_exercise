package leetcode.otherExcercise.printEmptyTriangle;

public class PrintShape {
    public static void print(int n) {
        if (n < 3) {
            System.out.println("level should be >= 3");
            return;
        }

        int fspace = n - 1;
        for (int clev = 1; clev <= n; clev++) {
            int mspace = (clev == 1 || clev == n) ? 0 : 1 + (2 * (clev - 2));

            if (clev == n) {
                System.out.println("*".repeat(1 + 2 * (clev - 1)));
            } else if (clev == 1) {
                System.out.println(" ".repeat(fspace) + "*");
            } else {
                System.out.println(" ".repeat(fspace) + "*" + " ".repeat(mspace) + "*");
            }

            fspace--;

        }

    }

}

/*
 * n level
 * limit n>=3
 *
 * *
 ***** 5
 * le3
 * 1st space 2>1>0
 * mid-space 0>1>0
 *
 * 
 * 
 * *
 * *
 ******* 7
 * le4
 * 1st space 3>2>1>0
 * mid-space 0>1>3>0
 *
 * 
 * *
 * *
 * *
 ********* 9
 * le5
 * 1st space 4>3>2>1>0 ((n-1)--)
 * mid-space 0>1>3>5>0 (1+2*(n-2)) (if lev = 1 or lev = n ==> 0)
 * last row (1+2*(n-1))
 * 
 */