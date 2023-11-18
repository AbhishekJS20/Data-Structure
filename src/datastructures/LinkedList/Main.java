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

        DoublyLinkedList myDLL= new DoublyLinkedList(7);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();
        myDLL.get(2);
        myDLL.set(2,4);
        myDLL.remove(4);
    }
}
