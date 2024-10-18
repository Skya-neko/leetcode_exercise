package leetcode.medium.p7_Reverse_Integer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.lang.StringBuilder;

public class Solution {
    public static int reverse(int x) {
        int result = 0;
        int rem;
        boolean isNegative = x < 0;
        if (isNegative) {
            x = x * (-1);
        }
        while (x > 0) {

            rem = x % 10;
            x = x / 10;
            // Overflow check // Not done by me , humko toh samajh hi ni aaya hai ki kya kiye hai yaha par?
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && rem > Integer.MAX_VALUE % 10)) {
                return 0;
            }
            System.out.println("result = " + result);
            System.out.println("rem = " + rem);
            result = result * 10 + rem;

        }
        if (isNegative) {
            result = -result;
        }
        return result;
    }
}
/*
Main{
int answer = Solution.reverse(2147483647);
        System.out.println(answer);
}
* */