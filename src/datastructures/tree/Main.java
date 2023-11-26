package datastructures.tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree byst= new BinarySearchTree();
        byst.insert(1);
        byst.insert(2);
        byst.insert(3);
        byst.insert(4);
        byst.insert(5);
        byst.insert(6);
        byst.insert(7);
        byst.insert(8);
        byst.insert(9);
        byst.insert(10);
        byst.insert(11);

        System.out.println(byst.root.left.right.value);

    }
}
