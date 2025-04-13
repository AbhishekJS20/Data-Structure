package AppnaCollege.Shoting;

public class Shoting {
    public static void printArray(int arr[]){
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        //time complexity is O(n^2)

        int arr[] = {54,65,21,43,11,45,23,13};
        for (int i = 0 ;i<arr.length;i++){
            for (int j = 0 ;j<arr.length-1;j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);
    }

}
