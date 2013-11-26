package uebung03;

import java.util.LinkedList;
/**
 * 
 * @author chris
 *
 * @param <T>
 */
public class Graph<T> {
	/**
	 * 
	 */
	private Node start;
	private Tiefensuche tief = new Tiefensuche<T>();
	private Breitensuche breit = new Breitensuche<T>();
	String name;
/**
 * 
 * @param node
 */
	public Graph(Node node) {
		this.start = node;
	}
/**
 * 
 * @param nodelist
 */
	public void copyInto(NodeListImpl<T> nodelist) {

		NodeListImpl<T> visited = new NodeListImpl<T>();
		copyInto(nodelist, start, visited);
	}
/**
 * 
 * @param nodelist
 * @param node
 * @param visited
 */
	private void copyInto(NodeListImpl<T> nodelist, Node<T> node, NodeListImpl<T> visited) {
		if (visited.contains(node)) {
			return;
		}
		visited.add(node);
		nodelist.add(node);
		for (Object nodee : node.getChildren()) {
			copyInto(nodelist, (Node) nodee, visited);
		}
	}
/**
 * 
 * @param name
 * @param toSearch
 * @return
 */
	public NodeListImpl<Node<T>> search(String name, Object toSearch) {
		NodeListImpl<Node<T>> nodelist = new NodeListImpl<Node<T>>();
		this.name = name;
		if (name.equals("Tiefensuche")) {
			return tief.search(start, toSearch);
		} else if (name.equals("Breitensuche")) {
			return breit.search(start, toSearch);
		} else {
			throw new IllegalArgumentException("Falscher Name für die Suche");
		}
	}
/**
 * 
 * @return
 */
	public NodeListImpl<Node> getPath() {
		if (this.name.equals("Tiefensuche")) {
			return tief.getPath();
		}
		return breit.getPath();

	}
}
