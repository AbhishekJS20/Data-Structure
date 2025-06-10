package neetCodeQuestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set.size();


    }

    public static void main(String[] args) {
        int [] nums= {1,1,2};
        System.out.println(removeDuplicates(nums));

    }
}
