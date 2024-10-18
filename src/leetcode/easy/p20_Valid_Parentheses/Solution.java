package leetcode.easy.p20_Valid_Parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack stack = new Stack();
        for (char i : charArray) {
            if (i == '(' || i == '[' || i == '{') {
                stack.push(map.get(i));
            } else {
                if (stack.isEmpty() || i != (char) stack.pop()) return false;

            }
        }
        return stack.isEmpty();

    }
}
