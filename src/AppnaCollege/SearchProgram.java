package AppnaCollege;

public class SearchProgram {
    public static int lenearSearch(int [] num, int key){
        for (int i = 0; i < num.length; i++) {
            if (key == num[i]) {
                return i;
            }
        }
        return -1;
    }
    public static int largestNum(int[] nums){
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(large<nums[i]){
                large = nums[i];
            }
        }
        return large;
    }
    public static int binarySearch(int [] nums, int key){
        int start =0, end =nums.length-1;
        while (start<end){
            int mid = (start+end)/2;
            if(mid == key){
                return mid;
            }
            if(mid<key){
                start= mid+1;
            }
            else
                end = mid -1;
        }
        return -1;
    }
    
    public static void reverseArray(int [] nums){
        int first =0, last = nums.length-1;
        while (first<last){
            int temp = nums[last];
            nums[last]= first;
            first = temp;

            first++;
            last--;
        }
    }
    public static void pairOfArray(int [] nums)
    {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print("("+i+","+j+")");

                }
                System.out.println();
            }

        }
    }
    public static void subArray(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k]);
                }
                System.out.println();
            }

        }
    }
    public static void subArrayPreFix(int [] nums){
       int currSum =0;
       int maxSum = Integer.MIN_VALUE;
       int preFix[] = new int[nums.length];
        for (int i = 1; i < preFix.length; i++) {
            preFix[i] = preFix[i-1]+nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int start = i ;
            for (int j = i; j < nums.length; j++)
            {
                int end = j;
                currSum = start == 0 ? preFix[end] : preFix[end] - preFix[start-1];
                if (maxSum <currSum){
                    maxSum = currSum;
                }

            }
        }
        System.out.print("Max sum ="+maxSum);
    }



    public static void main(String[] args) {
        int[] num = {10,20,34,2,54,23};
        int key=  34;
        System.out.println("lenearSearch-->"+lenearSearch(num,key));
        System.out.println("Largest Number -> "+largestNum(num));
        int [] binary = {1,3,4,6,7,9,10};
        System.out.println("Binary Search -> "+binarySearch(binary,8));
      //  System.out.println("reverse of Array --> "+ reverseArray(num));
        pairOfArray(num);
        subArray(num);
        subArrayPreFix(num);
    }
}


