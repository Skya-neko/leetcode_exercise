package leetcode.easy.p35_Search_Insert_Position;

import java.util.Arrays;

public class Solution {
    public static int searchInsert(int[] nums, int target) {
        //O(log n)的解法 使用Binary search
        int lBound = 0;
        int rBound = nums.length - 1;

        while (lBound <= rBound) {
            int mid = (lBound + rBound) / 2;
            if (target > nums[mid])
                lBound = mid + 1;
            else if (target < nums[mid])
                rBound = mid - 1;
            else
                return mid;
        }
        return lBound;
    }
}

/* O(n)的解法
public static int searchInsert(int[] nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                result = i;
                break;
            }

            result = nums.length;
        }
        return result;
    }
 */


/*算錯 先暫存
  int lenOfNums = nums.length % 2 == 0 ? nums.length : nums.length + 1;
        int DoTimes = (int) LogBase2.Calculate(lenOfNums);

        int cursor = (int) Math.pow(2, DoTimes - 1) - 1; //減1是因為int[]從0開始數
        for (int i = DoTimes - 1; i >= 0; i--) {
            int currExpo = Math.max(i - 1, 0);
            if (target > nums[cursor]) {
                cursor += (int) Math.pow(2, currExpo);
                continue;
            }
            if (target < nums[cursor]) {
                cursor -= (int) Math.pow(2, currExpo);
                continue;
            }
            if (target == nums[cursor])
                break;

        }

        return cursor;

* */