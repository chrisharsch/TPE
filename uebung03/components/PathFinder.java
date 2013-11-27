package components;

import lists.Node;
import lists.NodeListImpl;
/**
 * 
 * @author Chris Harsch und Severin Kohler
 *
 * @param <T>
 * Typ des Pfades
 */
public class PathFinder<T> {
	/**
	 * Liste die den Pfad der letzten Suche zurueckgibt
	 */
	protected NodeListImpl<Node> path = new NodeListImpl<Node>();
	
}
