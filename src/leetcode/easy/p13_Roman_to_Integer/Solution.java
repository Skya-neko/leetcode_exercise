package leetcode.easy.p13_Roman_to_Integer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static int romanToInt(String s) {

        if (s == null || s.isEmpty())
            throw new IllegalArgumentException("Wrong input");


//        map.put("I", 1);
//        map.put("IV", 4);
//        map.put("V", 5);
//        map.put("IX", 9);
//        map.put("X", 10);
//        map.put("XL", 40);
//        map.put("L", 50);
//        map.put("XC", 90);
//        map.put("C", 100);
//        map.put("CD", 400);
//        map.put("D", 500);
//        map.put("CM", 900);
//        map.put("M", 1000);

//        map.put("I", 1);
//        map.put("V", 5);
//        map.put("IV", 4);
//        map.put("IX", 9);
//        map.put("X", 10);
//        map.put("L", 50);
//        map.put("XL", 40);
//        map.put("XC", 90);
//        map.put("C", 100);
//        map.put("D", 500);
//        map.put("CD", 400);
//        map.put("CM", 900);
//        map.put("M", 1000);
//
//        List<String> list = new ArrayList<>();
//        list.add("M");
//        list.add("CM");
//        list.add("CD");
//        list.add("D");
//        list.add("C");
//        list.add("XC");
//        list.add("XL");
//        list.add("L");
//        list.add("X");
//        list.add("IX");
//        list.add("IV");
//        list.add("V");
//        list.add("I");

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        int sum = 0;
        Character cur;
        Character next;
        int curVal;
        int nextVal;
        for (int i = 0; i < s.length(); i++) {
            cur = s.charAt(i);
            next = i < (s.length() - 1) ? s.charAt(i + 1) : null;


            curVal = map.get(cur);
            if (next == null) {
                sum += curVal;
                break;
            }
            nextVal = map.get(next);

            if (curVal >= nextVal)
                sum += curVal;
            else
                sum -= curVal;

//            System.out.println("cur" + cur);
//            System.out.println("next" + next);
//            System.out.println(sum);
        }
        return sum;


    }
}

/*其他人的好解答!
if (s == null || s.length() == 0) {
            throw new IllegalArgumentException("Wrong Input");
        }

        Map<Character, Integer> map = new HashMap<>();

        map.put('M', 1000);
		map.put('D', 500);
		map.put('C', 100);
		map.put('L', 50);
		map.put('X', 10);
		map.put('V', 5);
		map.put('I', 1);

        int result = 0;
        int prev = 0;

        for (char k: s.toCharArray()) {
            int curr = map.get(k);
            result += prev < curr ? (curr - 2 * prev) : curr;
            prev = curr;
        }

        return result;

 */

/*Main
import leetcode.easy.p13_Roman_to_Integer.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.romanToInt("MCMXCIV"));
    }
}

*/