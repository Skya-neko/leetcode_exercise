import leetcode.easy.p14_Longest_Common_Prefix.Solution;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] testCase1 = new String[]{"flower", "flow", "flight"};
        String[] testCase2 = new String[]{"dog", "racecar", "car"};
        String answer = Solution.longestCommonPrefix(testCase1);
        System.out.println(answer);

    }
}
