


public interface SearchStrategy<T> {

    public NodeList<Node<T>> search(Node<T> startknoten, T wert);

    public NodeListImpl<Node <T>> getPath();

}