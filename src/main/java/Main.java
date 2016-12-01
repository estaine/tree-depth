public class Main {
    public static void main(String[] args) {
        Node tree = generateTree();
        Node startNode = tree.children.get(0).children.get(2);

        Node root = getRootNode(startNode);
        int maxDepth = getMaxDepth(root);

        System.out.print("Max depth: " + maxDepth);
    }


    private static Node generateTree() {
        Node root = new Node(null);

        Node child1 = new Node(root);
        Node child2 = new Node(root);
        Node child3 = new Node(root);

        Node child1_1 = new Node(child1);
        Node child1_2 = new Node(child1);
        Node child1_3 = new Node(child1);

        Node child2_1 = new Node(child2);
        Node child2_2 = new Node(child2);

        Node child3_1 = new Node(child3);

        Node child2_1_1 = new Node(child2_1);

        Node child2_1_1_1 = new Node(child2_1_1);
        Node child2_1_1_2 = new Node(child2_1_1);

        return root;
    }

    private static Node getRootNode(Node node) {
        if (node == null) {
            throw new RuntimeException("Bad input :(");
        }

        while (node.parent != null) {
            node = node.parent;
        }

        return node;
    }

    private static int getMaxDepth(Node node) {
        if (node.children == null)
            return 1;
        else {
            int maxDepth = 0;

            for (Node child : node.children) {
                int depth = getMaxDepth(child);
                maxDepth = depth > maxDepth ? depth : maxDepth;
            }

            return maxDepth + 1;
        }
    }
}