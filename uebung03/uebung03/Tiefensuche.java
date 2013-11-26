package uebung03;

public class Tiefensuche<T> extends PathFinder implements SearchStrategy<T>{
	private NodeListImpl<Node<T>> nodelist = new NodeListImpl<Node<T>>();
	

	
	private NodeListImpl<Node<T>> toSearch(Node<Node<T>> node, T toSearch) {
		path.add(node);
        if (node.equals(toSearch)) {
            nodelist.add(node);
        }
        for ( Object nodee : node.getChildren()) {
            if (!path.contains(nodee)) {
                toSearch((Node) nodee, toSearch);
            }
        }
        return nodelist;
	}


	@Override
	public NodeListImpl<Node<T>> search(Node<Node<T>> node, T toSearch) {
		path.clear();
		return toSearch(node, toSearch);
	}

}
