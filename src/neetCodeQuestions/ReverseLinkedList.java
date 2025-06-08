package neetCodeQuestions;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
       if(head == null){
           return null;
        }
       ListNode newNode = head;
       if(newNode.next!=null){
           newNode= reverseList(head.next);
           head.next.next=head;
       }
       head.next=null;
       return newNode;
    }

    public static void main(String[] args) {

      //  System.out.println(reverseList());
    }
}
