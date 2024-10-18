package leetcode.medium.p1405_Longest_Happy_String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static String longestDiverseString(int a, int b, int c) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", a);
        map.put("b", b);
        map.put("c", c);

        List<Map.Entry<String, Integer>> orderedList = getOrderedList(map);
        String maxField = getMaxEntry(orderedList).getKey();


        System.out.println("maxField  " + maxField + " = " + map.get(maxField));
        StringBuilder sb = new StringBuilder();
        sb.append(maxField);
        map.replace(maxField, map.get(maxField) - 1);

        String lastChar = "";
        String lastSecondChar = "";
        BoolWrapper isEnd = new BoolWrapper(false);
        while (!isEnd.value) {
            lastChar = sb.substring(sb.length() - 1);
            orderedList = getOrderedList(map);
            maxField = getMaxEntry(orderedList).getKey();


            if (sb.length() > 1) {
                lastSecondChar = sb.substring(sb.length() - 2, sb.length() - 1);
                if (lastChar.equals(lastSecondChar) && lastChar.equals(maxField)) {
                    maxField = getSecondEntry(orderedList).getKey();
                }
            }

            System.out.println("maxField  " + maxField + " = " + map.get(maxField));
            addNewChar(maxField, map, sb, orderedList, isEnd);
            showRemain(sb, orderedList);

            boolean endCondition2 = map.values().stream().mapToInt(k -> k).sum() == 0;
            boolean endCondition3 = orderedList.get(1).getValue() == 0 && orderedList.get(2).getValue() == 0 && (lastChar.equals(lastSecondChar) && lastChar.equals(maxField));
            isEnd.value = isEnd.value || endCondition2 || endCondition3;

        }
        System.out.println("final sb = " + sb.toString());
        return sb.toString();
    }


    private static void addNewChar(String maxField, Map<String, Integer> map, StringBuilder sb, List<Map.Entry<String, Integer>> orderedList, BoolWrapper isEnd) {
        if (map.get(maxField) - 1 >= 0) {
            sb.append(maxField);
            map.replace(maxField, map.get(maxField) - 1);
        } else {
            isEnd.value = true;
        }
    }

    private static void showRemain(StringBuilder sb, List<Map.Entry<String, Integer>> orderedList) {
        System.out.println("sb = " + sb);
        System.out.print("remain-------->  ");
        orderedList.forEach((entry) -> {
            System.out.print(entry.getKey() + " = " + entry.getValue() + ", ");
        });
        System.out.println();
    }

    private static Map.Entry<String, Integer> getMaxEntry(List<Map.Entry<String, Integer>> list) {
        return list.getFirst();
    }

    private static Map.Entry<String, Integer> getSecondEntry(List<Map.Entry<String, Integer>> list) {
        return list.get(1);
    }

    private static List<Map.Entry<String, Integer>> getOrderedList(Map<String, Integer> map) {
        // 將 Map 條目轉換為 List
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // 使用 Comparator 根據值降序排序
        list.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        // 打印排序後的結果，鍵和值都會顯示
//        for (Map.Entry<String, Integer> entry : list) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }
        return list;
    }


}
