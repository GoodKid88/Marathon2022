package Day18;

public class Node {
    private Node root;
    private Node left;
    private Node right;
    private int value;


    public Node(int value, Node root) {
        this.value = value;
        this.root = root;
    }

    @Override
    public String toString() {
        return value + " ";
    }

    public void addNode(int i) {
        if (root == null) {
            root = this;
            addNode(i);
        } else {
            if (i < this.value){
                if(left == null){
                    left = new Node(i, this);
                }else{
                    left.addNode(i);
                }
            }else{
                if(right == null){
                    right = new Node(i, this);
                }else{
                    right.addNode(i);
                }
            }
        }
    }

    public void dfs(Node node) {
        if(node == null){
            return;
        }
        dfs(node.left);
        System.out.print(node);
        dfs(node.right);
    }
}
