package AppnaCollege.Shoting;

public class SelectionShoting {
    public static void printArray(int arr[]){
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    int arr[] = {54,65,21,43,11,45,23,13};
        for(int i =0;i< arr.length-1;i++) {
            int min = arr[i];
            for (int j = i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min]= arr[i];
            arr[i]= temp;
        }
        printArray(arr);
    }

}
