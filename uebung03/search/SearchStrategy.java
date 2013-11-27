package search;

import lists.Node;
import lists.NodeListImpl;

/**
 * Interface zu Uebergabe der Methoden an die Suchmethoden
 * @author Chris Harsch und Severin Kohler
 *
 * @param <T>
 * Typ des Interfaces
 */
public interface SearchStrategy<T> {
	public NodeListImpl<Node<T>> search( Node<Node<T>> node, T toSearch);
	public NodeListImpl<Node> getPath();
		

}
