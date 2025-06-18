package neetCodeQuestions;


//https://leetcode.com/problems/remove-element/description/?envType=problem-list-v2&envId=array
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static int option2(int[] nums, int val) {
        int count = nums.length;
        int i = 0;
        while (i< count){
            if (nums[i] == val){
                nums[i]= nums[count -1];
                count--;
            }else {
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] num = {0,1,2,2,3,0,4,2};
      //  System.out.println(option2(num,2));
        System.out.println(removeElement(num,2));
    }
}
