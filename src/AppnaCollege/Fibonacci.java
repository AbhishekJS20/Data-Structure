package AppnaCollege;

class Fibonacci {

    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int n = 7;
        for (int i = 2; i <= n; i++) {
            int temp = second;
            second = first + second;
            first = temp;
            System.out.println(second);
        }
    }
       
}