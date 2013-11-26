package uebung03;
/**
 * 
 * @author chris
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
	 * @return 
	 */
	public NodeListImpl<Node<T>> search(Node<Node<T>> node, T toSearch) {
		path.clear();
		return toSearch(node, toSearch);
	}

	@Override
	/**
	 * 
	 */
	public NodeListImpl<Node> getPath() {
		return path;
	}

}
