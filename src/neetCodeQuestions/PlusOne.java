package neetCodeQuestions;

public class PlusOne {
    public static int[] plusOne(int[] digits) {

        for (int i = digits.length-1;i>=0; i--) {
            if(digits[i]+1 != 10){
                digits[i] +=1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigit = new int[digits.length+1];
        newDigit[0] = 1;
        return newDigit;

    }

    public static void main(String[] args) {
        int[] n= {9,9};
        System.out.println(plusOne(n));
    }
}
