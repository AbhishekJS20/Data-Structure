package neetCodeQuestions;

public class ReverseVowelsofaString {
    public static String reverseVowels(String s) {
        // Convert the string to a character array for easy manipulation
        char[] ch = s.toCharArray();
        // Define two pointers: one at the start, one at the end
        int left = 0, right = ch.length - 1;
        // String containing all vowels (both lowercase and uppercase)
        String vowels = "aeiouAEIOU";
        // Loop until the two pointers meet
        while (left < right) {
            // Move left pointer forward if not a vowel
            while (left < right && vowels.indexOf(ch[left]) == -1) left++;
            // Move right pointer backward if not a vowel
            while (left < right && vowels.indexOf(ch[right]) == -1) right--;
            // If both pointers are at vowels, swap them
            if (left < right) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        // Convert the character array back to a string and return
        return new String(ch);
    }


    public static void main(String[] args) {
        String s = "IceCreAm"; //AceCreIm"
        System.out.println(reverseVowels(s));

    }
}
