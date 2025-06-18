package neetCodeQuestions;
//https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
public class CanPlaceFlowers {
    public static boolean option1(int[] flowerbed, int n){
        if(n==0){
            return true;
        }
        int count=0;
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0 )&& (i==flowerbed.length-1 || flowerbed[i+1]==0)){
                count++;
                if(count==n){
                    return true;
                }
            }

        }
        return false;
    }
}
