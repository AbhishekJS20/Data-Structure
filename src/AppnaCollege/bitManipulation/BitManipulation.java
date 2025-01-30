package AppnaCollege.bitManipulation;

import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        int n =5;
        int pos = 1;
        int bitMask = 1<<pos;
        if ((bitMask & n)==0){
            System.out.println("Bit was zero");
        }else
            System.out.println("Bit was one");
        //set bit
        int newNumber = bitMask | n;
        System.out.println("the new number of set Bit= "+newNumber);
        //clear bit
        int notBitMask = ~(bitMask);
        int newNumberclear= notBitMask & n;
        System.out.println(newNumberclear);
        //update bit
        Scanner sc = new Scanner(System.in);

        int oper =sc.nextInt(); // update bit to 1 else update bit to 0
        int bitM = 1<<pos;
        if(oper == 1){
            int newNumberupdate = bitM | n;
            System.out.println(newNumberupdate);
        }
        else{
            int newBitMask = ~(bitMask);
            int newNumberupdate = newBitMask & n;
            System.out.println(newNumberupdate);
        }

    }
}
