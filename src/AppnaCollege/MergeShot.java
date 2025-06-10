package AppnaCollege;

public class MergeShot {
    public static void devide(int [] arr, int si, int ei){
       while (si>=ei){
           return;
       }
        int mid = si + (ei - si) / 2;
        devide(arr,si,mid);
        devide(arr,mid+1,ei);
        conquence(arr,si,mid,ei);
    }

    private static void conquence(int[] arr, int si, int mid, int ei) {
        int merge[] =new int[ei-si+1];
        int idx1= si;
        int idx2 = mid+1;
        int x =0;
        while(idx1<=mid && idx2 <= ei){
            if(arr[idx1]<= arr[idx2]){
                merge[x]= arr[idx1];
                x++; idx1++;
            }else {
                merge[x]=arr[idx2];
                x++; idx2++;
            }
        }
        while (idx1<=mid){
            merge[x]= arr[idx1];
            x++; idx1++;
        }
        while (idx2<=ei){
            merge[x]= arr[idx2];
            x++; idx2++;
        }
        for (int i = 0, j = si; i < merge.length; i++,j++) {
            arr[j]=merge[i];
        }
    }

    public static void main(String[] args) {
        int[] n = {3,5,1,4,6,7};
        devide(n,0,n.length-1);
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);

        }

    }
}
