//find the index of the first and last occurrence
package AppnaCollege;

public class FindOccourance {
    public static int first = -1;
    public static int last = -1;
    public static void occourance(String str, int idx, char ele) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curchar = str.charAt(idx);
        if(curchar==ele){
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        occourance(str,idx+1, ele);
    }

    public static void main(String[] args) {
    String str = "aabbhhhha";
        FindOccourance.occourance(str,0,'a');

    }
}
