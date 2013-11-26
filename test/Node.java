


import java.util.Collections;

public class Node<T> {

    private String name;
    private T value;
    private NodeListImpl<Node<T>> kinder = new NodeListImpl<Node<T>>();

    public Node(String name, T value, Node<T>... kinder) {
        this.name = name;
        this.value = value;
        Collections.addAll(this.kinder, kinder);
    }

    public void addChild(Node<T> kind) {
        this.kinder.add(kind);
    }

    public String getName() {
        return this.name;
    }

    public T getValue() {
        return value;
    }

    public NodeListImpl<Node<T>> getChildren() {
        return kinder;
    }

    @Override
    public String toString() {
        return "(" + name + "|" + value + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        //TODO: andere implementierung suchen, kinder.equals vergleicht alle kinder miteinander -> endlose Rekursion wenn A --> B und B --> A zeigt.
        if (kinder != null ? !kinder.equals(node.kinder) : node.kinder != null) return false;

        if (name != null ? !name.equals(node.name) : node.name != null) return false;
        if (value != null ? !value.equals(node.value) : node.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (kinder != null ? kinder.hashCode() : 0);
        return result;
    }
}