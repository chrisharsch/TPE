

public class Tiefensuche<T> extends SearchHelper<T> implements SearchStrategy<T> {


    @Override
    public NodeListImpl<Node<T>> search(Node<T> root, T wert) {
        letzterPfad.clear();
        return preOrderRek(root, wert, new NodeListImpl<Node<T>>());
    }


    private NodeListImpl<Node<T>> preOrderRek(Node<T> root, T wert, NodeListImpl<Node<T>> results) {
        letzterPfad.add(root);
        if (root.getValue() == wert) {
            results.add(root);
        }
        for (Node<T> node : root.getChildren()) {
            if (!letzterPfad.contains(node)) {
                preOrderRek(node, wert, results);
            }
        }
        return results;
    }


    @Override
    public NodeListImpl<Node<T>> getPath() {
        return letzterPfad;
    }
}