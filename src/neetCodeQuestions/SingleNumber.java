package neetCodeQuestions;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]!=nums[j]){
                    flag =true;
                }
            }
            if(flag){
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
         
    }
}
