

public class Graph<T> {

    Node<T> root;

    public Graph(Node<T> root) {
        this.root = root;
        search(root.getValue(), new Tiefensuche<T>());
    }

    public Node<T> getRoot() {
        return this.root;
    }

    public void search(T wert, SearchStrategy<T> methode) {
        methode.search(root, wert);
    }

    public NodeListImpl<Node<T>> copyInto() {
        return copyIntoRek(root, new NodeListImpl<Node<T>>());

    }

    private NodeListImpl<Node<T>> copyIntoRek(Node<T> root, NodeListImpl<Node<T>> elements){
        for(Node<T> nodes: root.getChildren()){
            copyIntoRek(nodes, elements);
        }
        elements.add(root);
        return elements;
    }

}