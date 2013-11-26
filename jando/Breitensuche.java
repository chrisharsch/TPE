

public class Breitensuche<T> extends SearchHelper<T> implements SearchStrategy<T> {

    @Override
    public NodeListImpl<Node<T>> search(Node<T> root, T wert) {
        NodeListImpl<Node<T>> results = new NodeListImpl<Node<T>>();
        NodeListImpl<Node<T>> q = new NodeListImpl<Node<T>>();
        q.addFirst(root);
        Node<T> element;
        letzterPfad.clear();
        //Solange noch Elemente in der Liste sind
        while (!q.isEmpty()) {
            element = q.getLast();
            if (element.getValue() == wert) {
                results.add(element);
            }
            q.removeLast();
            letzterPfad.add(element);
            for (Node<T> node : element.getChildren()) {
                if (!letzterPfad.contains(node)) {
                    q.addFirst(node);
                }
            }
        }
        return results;
    }

    @Override
    public NodeListImpl<Node<T>> getPath() {
        return letzterPfad;
    }
}