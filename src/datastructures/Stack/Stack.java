package datastructures.Stack;

public class Stack {
    private Node top;
    private int hight;
    class  Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }
    public Stack(int value){
        Node newNode= new Node(value);
        top= newNode;
        hight=1;
    }
    public void printStack(){
        Node temp=top;
        while (temp!= null){
            System.out.println(temp.value);
            temp= temp.next;
        }
    }
    public void getTop() {
        System.out.println("Top: "+ top.value);
    }
    public void getHight(){
        System.out.println("Hight: "+ hight);
    }

    //Push method
    public void push(int value){
        Node newNode= new Node(value);
        if(hight==0){
            top= newNode;
        }else{
            newNode.next= top;
            top= newNode;
        }
        hight++;
    }
    //POP method
    public Node pop(){
        if(hight==0) return null;

        Node temp=top;
        top=top.next;
        temp.next=null;

        hight--;
        return temp;

    }


}
