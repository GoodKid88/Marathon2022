package Day18;

public class Task3 {
    public static void main(String[] args) {
        Node node = new Node(20, null);
        node.addNode(14);
        node.addNode(23);
        node.addNode(16);
        node.addNode(11);
        node.addNode(5);
        node.addNode(8);
        node.addNode(15);
        node.addNode(18);
        node.addNode(22);
        node.addNode(27);
        node.addNode(24);
        node.addNode(150);

        node.dfs(node);
    }
}
