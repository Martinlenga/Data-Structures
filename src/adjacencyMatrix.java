public class adjacencyMatrix {
    public static void main(String[] args){

        graph graph = new graph(5);
        graph.addNode(new node('A'));
        graph.addNode(new node('B'));
        graph.addNode(new node('C'));
        graph.addNode(new node('D'));
        graph.addNode(new node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();

    }
}
