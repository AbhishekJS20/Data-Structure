package neetCodeQuestions;

public class ValidPalindrome {
    //String
    public boolean isPalindrome(String s) {
        String rev ="";
        String str = s.toLowerCase();
        for (int i = str.length()-1; i > 0; i--) {
            rev= rev+str.charAt(i);
        }
        return rev.equalsIgnoreCase(str);
    }
    //Number
    public static boolean isPalindromeNumber(int num){
        int inti =0, temp = num;
        if(num<0){
            return false;
        }
        while(num!=0){
            int rem=0;
            rem= num%10;
            inti = (inti*10)+rem;
            num=num/10;
        }
        if(inti == temp){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(121));
    }
}
