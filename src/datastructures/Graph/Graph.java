package datastructures.Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private final HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public void printGraph(){
        System.out.println(adjList);
    }
    public boolean addVertex(String vertex){
        if(adjList.get(vertex)== null){
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }
    public boolean addEdge(String vertext1, String vertext2){
        if(adjList.get(vertext1)!=null && adjList.get(vertext2)!= null){
            adjList.get(vertext1).add(vertext2);
            adjList.get(vertext2).add(vertext1);
            return true;
        }
        return false;
    }
    public boolean removeEdge(String vertext1, String vertext2){
        if(adjList.get(vertext1)!=null && adjList.get(vertext2)!= null){
            adjList.get(vertext1).remove(vertext2);
            adjList.get(vertext2).remove(vertext1);
            return true;
        }
        return false;
    }


}
