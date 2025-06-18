package neetCodeQuestions;
//https://leetcode.com/problems/reverse-string/
public class ReverseString {
    public static void option1(char [] s){
       int left = 0, right = s.length-1;
       while(left<right){
           char temp = s[left];
           s[left]= s[right];
           s[right]=temp;
           left++;
           right--;
       }
    }
    public static char[] option2(char [] s) {
        String rev ="";
        for (int i = s.length-1; i >=0 ; i--) {
            rev =rev+ s[i];
        }
        return rev.toCharArray();
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l','l', 'o'};
     //   option1(s);
        System.out.println(option2(s));
    }
}
