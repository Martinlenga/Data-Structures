public class binarySearchTree {
    Vertex root;

    public void insert(Vertex node){
        root = insertHelper(root, node);

    }
    private Vertex insertHelper(Vertex root, Vertex node){
        int data = node.data;

        if (root == null){
            root = node;
            return root;
        }
        else if (data < root.data) {
            root.left = insertHelper(root.left, node);

        }
        else{
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    public void display(){
        displayHelper(root);
    }
    private void displayHelper(Vertex root){
        if (root != null){
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }

    public boolean search(int data){
        return searchHelper(root, data);
    }
    private boolean searchHelper(Vertex root, int data){
        if (root == null){
            return false;
        }
        else if (root.data == data) {
            return true;
        }
        else if (root.data > data) {
            return searchHelper(root.left, data);
        }
        else{
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data){
        if(search(data)){
            removeHelper(root, data);
        }
        else{
            System.out.println(data + " could not be found");
        }
    }
    private Vertex removeHelper(Vertex root, int data){
        if(root == null){
            return root;
        }
        else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        }
        else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        }
        else{ //node found
            if(root.left == null && root.right == null){
                root = null; //leaf node
            }
            else if (root.right != null) { // find successor to replace this node
                root.data = successor(root);
                root.right = removeHelper(root.right,root.data);
            }
            else{ //find a predecessor to replace this node
                root.data = predecessor(root);
                root.left = removeHelper(root.left,root.data);
            }
        }

        return root;
    }

    private int successor(Vertex root){ // find least value below the right child of this root node
        root = root.right;
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }
    private int predecessor(Vertex root){ // find greatest value below the left child of this root node
        root = root.left;
        while(root.right != null){
            root = root.right;
        }
        return 0;
    }
    public static void main(String[] args){
        binarySearchTree tree = new binarySearchTree();

        tree.insert(new Vertex(5));
        tree.insert(new Vertex(1));
        tree.insert(new Vertex(9));
        tree.insert(new Vertex(2));
        tree.insert(new Vertex(7));
        tree.insert(new Vertex(3));
        tree.insert(new Vertex(6));
        tree.insert(new Vertex(4));
        tree.insert(new Vertex(8));

        tree.remove(2);
        tree.display();
        System.out.println(tree.search(1));


    }
}
