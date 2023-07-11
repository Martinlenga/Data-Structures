import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class graph {

    int [][] matrix;

    graph(int size){
        matrix = new int[size][size];
    }

    public void addNode(node node){

    }

    public void addEdge(int src, int dst){
    matrix[src][dst] = 1;

    }

    public boolean checkEdge(int src, int dst){
    if ( matrix[src][dst] == 1){
        return true;
    }
    else{
        return false;
    }
    }
    public void print(){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }




}
