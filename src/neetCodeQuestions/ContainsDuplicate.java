package neetCodeQuestions;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean option1(int[] nums) {
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                flag = nums[i] == nums[j];
            }
        }
        return flag;
    }
    //approch 2nd
    public static boolean option2(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }


    //approch 3rd
    public static boolean option3(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num:nums)
        {
            if(seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num = {3,4,5,2,1};
        System.out.println(option1(num));
        System.out.println(option2(num));
        System.out.println(option3(num));
    }
}
