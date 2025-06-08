package neetCodeQuestions;

import java.util.Arrays;

public class BinarySearch {
    public static int option1(int[] nums, int target){
        int idx =-1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                idx = i;
                return idx;
            }
        }
        return idx;
    }
    //Option 2
    public static int option2(int[] nums, int target){
        int idx = Arrays.binarySearch(nums,target);
        return idx>=0 ? idx: -1;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,2,4,6,8};
        System.out.println(option1(nums,4));
        System.out.println(option2(nums,6));

    }
}
