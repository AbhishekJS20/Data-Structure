//Check if the array is sorted
package AppnaCollege;

public class IsShorted {
    public static boolean isshorted(int[] a, int idx){
       if(idx==a.length-1){
           return true;
       }
       if(a[idx]<= a[idx+1]){
           return isshorted(a,idx+1);
       }else{
           return false;
       }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,9,10};
        System.out.println(isshorted(a,0));

    }
}
