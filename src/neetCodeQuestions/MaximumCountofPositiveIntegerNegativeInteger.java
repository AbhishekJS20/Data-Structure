package neetCodeQuestions;
//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/
public class MaximumCountofPositiveIntegerNegativeInteger {
    public static int maximumCount(int[] nums) {
        int Pcount =0;
        int Ncount =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                Pcount++;
            }
            if (nums[i]<0) {
                Ncount++;
            }
        }
        if(Pcount>=Ncount){
            return Pcount;
        }else {
            return Ncount;
        }

    }
    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2};
        System.out.println(maximumCount(nums));
    }
}
