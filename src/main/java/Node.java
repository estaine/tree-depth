import java.util.ArrayList;
import java.util.List;

public class Node {
    Node parent;
    List<Node> children;

    public Node(Node parent) {
        this.parent = parent;

        if (parent != null) {
            if (parent.children == null)
                parent.children = new ArrayList<>();

            parent.children.add(this);
        }
    }

}
