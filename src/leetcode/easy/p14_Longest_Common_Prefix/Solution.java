package leetcode.easy.p14_Longest_Common_Prefix;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String word = strs[0];
        String prefix = "";
        for (int i = 1; i <= word.length(); i++) {
            String prefixNew = word.substring(0, i);
            for (String str : strs) {
                if (!str.startsWith(prefixNew)) {
                    return prefix;
                }
            }
            prefix = prefixNew;
        }

        return prefix;


    }
}

/*
Main{
        String[] testCase1 = new String[]{"flower", "flow", "flight"};
        String[] testCase2 = new String[]{"dog", "racecar", "car"};
        String answer = Solution.longestCommonPrefix(testCase1);
        System.out.println(answer);
}
* */
