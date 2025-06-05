package neetCodeQuestions;
//https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        String merge ="";
        int m = word1.length();
        int n = word2.length();
        int i =0;
        int j= 0;
        while (i<m || j<n){
            if (i<m){
                merge= merge+word1.charAt(i++);
            }
            if (j<n){
                merge= merge+word2.charAt(j++);
            }
        }
        return merge;
    }

    public static void main(String[] args) {
        String word1= "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1,word2));

    }
}
