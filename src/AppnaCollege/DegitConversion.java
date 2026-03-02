package AppnaCollege;

public class DegitConversion {
    public static int toDigit(int num){
        int munum = num;
        int pow =0;
        int decimal = 0;
        while (num > 0){
            int lastDegit = num%10;
            decimal = decimal+(lastDegit * (int)Math.pow(2,pow));
            pow++;
            num = num/10;
        }
        return decimal;
    }
    public static int toBinary(int num){
        int pow =0;
        int binimal = 0;
        while (num>0){
            int rem = num % 2;
            binimal = binimal+ (rem * (int) Math.pow(10,pow));
            pow++;
            num = num/2;
        }
        return binimal;
    }

    public static void main(String[] args) {
        System.out.println(toDigit(101));
        System.out.println(toBinary(5));

    }
}
