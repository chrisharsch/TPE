package uebung03;

public class PathFinder<T> {
	protected static NodeListImpl<Node> path = new NodeListImpl<Node>();
	
	static public NodeListImpl<Node> getPath(){
		return path;
	}
}
