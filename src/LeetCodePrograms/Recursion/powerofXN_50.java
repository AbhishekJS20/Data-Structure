package LeetCodePrograms.Recursion;

public class powerofXN_50 {
 //Recursion
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        long pow = n;
        if(pow <0){
            x=1 / x;
            pow = -pow;
        }
        return fastPow(x,pow);
    }
    private double fastPow (double x, long n){
        if (n == 0){
            return 1;
        }
        double half = fastPow(x, n/2);
        if(n % 2 == 0 ) {
            return half * half;
        }   
        else {
            return half * half * x;
        }
    }
}
