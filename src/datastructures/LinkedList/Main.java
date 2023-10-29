package datastructures.LinkedList;

public class Main {
    public static void main(String[] arg)
    {
        LinkedList ls= new LinkedList(4);
       /* ls.getHead();
        ls.getTail();
        ls.printList();*/
        ls.append(3);
        ls.append(5);
      //  ls.printList();
        ls.removeLast();
        ls.printList();
        ls.remove(4);
        ls.printList();
        ls.reverse();
        ls.printList();
    }
}
