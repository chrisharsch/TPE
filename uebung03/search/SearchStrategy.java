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
public interface SearchStrategy<T extends Object> {
	public NodeListImpl<Node> getPath();
	NodeListImpl<Node<T>> search(T node, T toSearch);
		

}
