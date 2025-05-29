package neetCodeQuestions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        return Arrays.equals(charS,charT);
    }
    //approch 2 using hashTable
    public static boolean isAnagramHastable(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";
        System.out.println(isAnagram(s,t));
        System.out.println(isAnagramHastable(s,t));
    }
}
