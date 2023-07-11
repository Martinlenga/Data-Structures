import java.util.ArrayList;
import java.util.LinkedList;

public class adjacencyList {




    public static void main(String[] args){
        Graphs graph = new Graphs();

        graph.addNode(new Nodes('A'));
        graph.addNode(new Nodes('B'));
        graph.addNode(new Nodes('C'));
        graph.addNode(new Nodes('D'));
        graph.addNode(new Nodes('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();
    }


}
