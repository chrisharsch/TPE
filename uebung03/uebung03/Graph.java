package uebung03;



import java.util.LinkedList;

public class Graph<T> {
	private Node start;
	private Tiefensuche tief = new Tiefensuche<T>();
	private Breitensuche breit = new Breitensuche<T>();
	public Graph(Node node) {
		this.start = node;
	}

	public void copyInto(NodeListImpl<T> nodelist) {

		NodeListImpl<T> visited = new NodeListImpl<T>();
		copyInto(nodelist, start, visited);
	}

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

	public NodeListImpl<Node<T>> search(String name, Object toSearch) {
		NodeListImpl<Node<T>> nodelist = new NodeListImpl<Node<T>>();
		if (name.equals("Tiefensuche")) {
			return tief.search(start, toSearch);
		} else if (name.equals("Breitensuche")) {
			return breit.search(start, toSearch);
		} else {
			throw new IllegalArgumentException("Falscher Name für die Suche");
		}
	}
	public NodeListImpl<Node> getPath(){
		return PathFinder.getPath();
	}
}
