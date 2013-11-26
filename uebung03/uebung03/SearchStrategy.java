package uebung03;

public interface SearchStrategy<T> {
	public NodeListImpl<Node<T>> search( Node<Node<T>> node, T toSearch);
		

}
