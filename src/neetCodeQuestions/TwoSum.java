package neetCodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{nums[i], nums[j]};
                }
            }
        }
        return new int[0];
    }

    public static int[] twoSumHashMap(int[] nums, int target) {
            java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[]{map.get(complement), i};
                }
                map.put(nums[i], i);
            }
            return new int[0];
        }

    public static void main(String[] args) {
        int[] nums = {3,4,5,6};
        int target = 7;
        //twoSum(nums,target);
        System.out.println(Arrays.toString(twoSum(nums,target)));
        System.out.println(Arrays.toString(twoSumHashMap(nums,target)));
    }
}
