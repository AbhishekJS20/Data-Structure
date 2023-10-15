package Collection;

public class PlayingWithSyntax {
    public static void main(String[] args) {

        int[]  x1;	//most precise syntax to follow
        int [] x2;
        int x3[];

        //int[3] x4;

        int x5[],x6[];
        //int x7[],[]x8;	//we can specify the dimension before variable, but only with the first variable.

        int []x9,x10[];

        //---------------

        int[][] x11;	//most precise syntax
        int [][]x12;
        int [][] x13;

        int []x14[];
        int x15[][];
        int[][] x16,x17;

        int[] x18[],x19;	//int[] is both for x18 and x19

        int[] []x20,x21;	//both are 2-D array

        int[] [] [] x22,x23;	//both are 3-D array

        //-----------------

        //int [][] x24 = new int [][4];		//must provide base size

        int [][][] x25 = new int [3][4][5];
        int [][][] x26 = new int [3][4][];
        //int [][][] x27 = new int [3][][5];
        //int [][][] x28 = new int [][4][5];



    }
}
