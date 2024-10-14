package leetcode.medium.p7_Reverse_Integer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.lang.StringBuilder;

public class Solution {
    public static int reverse(int x) {
        boolean isNegative = x < 0;
        long absoluteX = isNegative ? (long) x * -1 : (long) x;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(absoluteX);
        String reversedNum = stringBuilder.reverse().toString();
        long longReversedNum = Long.parseLong(reversedNum);
        if ((longReversedNum <= Math.pow(-2, 31)) || (longReversedNum >= Math.pow(2, 31) - 1)) return 0;
        return isNegative ? Math.toIntExact(longReversedNum) * -1 : Math.toIntExact(longReversedNum);

    }
}
