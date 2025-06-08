/*
package DSA_Question;

public class RotatedShorted {
    public int search(int[] arr, int target){
        int n= arr.length;
        int p =peakIndrxInMountainArray(arr);
        int l= bs(arr,target,0,p);
        if (1!=-1)
            return bs(arr,target,p+1,n-1);
    }
    static int bs(int[] arr, int target, int s, int e){
        while (s<=e){
            int m = s+(e-s)/2;
            if(target>arr[m])s=m+1;
            else if (target<arr[m])e=m-1;
            else return m;
        }
        return -1;
    }
}
*/
