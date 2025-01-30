package datastructures.Graph;

public class Main {
    public static void main(String[] args) {
        Graph gh= new Graph();
        gh.addVertex("A");
        gh.addVertex("B");
        gh.addVertex("C");

        gh.addEdge("A","B");
        gh.addEdge("B","C");
        gh.addEdge("C","A");

        gh.removeEdge("A","C");



        gh.printGraph();
    }
}
