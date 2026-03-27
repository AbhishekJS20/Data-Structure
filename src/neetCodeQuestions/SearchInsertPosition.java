package neetCodeQuestions;
//https://leetcode.com/problems/search-insert-position/?envType=study-plan-v2&envId=binary-search
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(target == nums[mid])
                return mid;
            if(target<nums[mid])
                end = mid-1;
            else{
                start= mid +1;
            }

        }
        return start;

    }

    public static void main(String[] args) {
        int[] nums ={1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums,target));
    }
}
