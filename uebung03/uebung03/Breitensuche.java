package uebung03;

public class Breitensuche<T> extends PathFinder implements SearchStrategy<T> {


	@Override
	public NodeListImpl<Node<T>> search(Node<Node<T>> node, T toSearch) {
		NodeListImpl found = new NodeListImpl();
		NodeListImpl warte = new NodeListImpl();
		warte.addFirst(node);
		path.clear();
		path.add(node);
		while (!warte.isEmpty()) {
			node = (Node) warte.getLast();
			if (node.equals(toSearch)) {
				found.add(node);
			}
			warte.removeLast();
			for (Object node2 : node.getChildren()) {
				if (!path.contains(node2)) {
					warte.addFirst(node2);
					path.add(node2);
				}
			}
		}
		return found;
	}
}