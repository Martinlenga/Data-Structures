import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graphs {
        ArrayList<LinkedList<Nodes>> alist;

        Graphs(){
            alist = new ArrayList<>();
        }
        public void addNode(Nodes node){
                LinkedList<Nodes> currentList = new LinkedList<>();
                currentList.add(node);
                alist.add(currentList);
        }

        public void addEdge(int src, int dst){
                LinkedList<Nodes> currentList = alist.get(src);
                Nodes dstNode = alist.get(dst).get(0);
                currentList.add(dstNode);

        }

        public boolean checkEdge(int src, int dst){
                LinkedList<Nodes> currentList = alist.get(src);
                Nodes dstNode = alist.get(dst).get(0);

                for(Nodes node : currentList){
                        if (node == dstNode){
                                return true;
                        }
                }
                return false;
        }

        public void print(){
                for(LinkedList<Nodes> currentList : alist){
                        for(Nodes node :currentList){
                                System.out.print(node.data + " -> ");
                        }
                        System.out.println();
                }
        }

}
