package search;

import components.PathFinder;

import lists.Node;
import lists.NodeListImpl;

/**
 * 
 * @author Chris Harsch und Severin Kohler
 * 
 * @param <T>
 */
public class Tiefensuche<T> extends PathFinder implements SearchStrategy<T> {
	/**
	 * 
	 */
	private NodeListImpl<Node<T>> nodelist = new NodeListImpl<Node<T>>();

	/**
	 * 
	 * @param node
	 * @param toSearch
	 * @return
	 */
	private NodeListImpl<Node<T>> toSearch(Node<Node<T>> node, T toSearch) {
		path.add(node);
		if (toSearch.equals(node.getValue())) {
			nodelist.add(node);
		}
		for (Object nodee : node.getChildren()) {
			if (!path.contains(nodee)) {
				toSearch((Node) nodee, toSearch);
			}
		}
		return nodelist;
	}

	@Override
	/**
	 * @param node Knoten von dem aus gesucht werden soll
	 * @param toSearch der zu Suchende Wert mit dem alle Kinder von node und node selbst verglichen werden
	 * @return gibt die Liste der Knoten mit dem uebereinstimmenden Values toSearch wieder
	 * 
	 */
	public NodeListImpl<Node<T>> search(T node, T toSearch) {
		path.clear();
		return toSearch((Node<Node<T>>) node, toSearch);
	}

	@Override
	/**
	 * Methode um den Pfad der letzten Suche wieder zu geben
	 * 
	 * @return Gibt eine Liste des letzten Suchpfades zurück
	 */
	public NodeListImpl<Node> getPath() {
		return path;
	}

}
