package neetCodeQuestions;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String rev ="";
        String str = s.toLowerCase();
        for (int i = str.length()-1; i > 0; i--) {
            rev= rev+str.charAt(i);

        }
        if(rev.equalsIgnoreCase(str))
            return true;
        return false;

    }
}
