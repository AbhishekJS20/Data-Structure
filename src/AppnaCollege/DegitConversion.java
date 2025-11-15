package AppnaCollege;

public class BinaryToDigit {
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

    public static void main(String[] args) {
        System.out.println(toDigit(101));

    }
}
