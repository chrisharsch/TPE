package lists;

import java.util.LinkedList;
/**
 * Klasse um einen Knoten mit eines beliebigen Typ anzulegen
 * @author Chris Harsch und Severin Kolher
 *
 * @param <T>
 * Typ des Knotens
 */
	public class Node<T> {
	private String name;
	private T wert;
	private NodeListImpl<Node<T>> childNodes = new NodeListImpl<Node<T>>();
	public Node(String name, T wert){
		this.name=name;
		this.wert = wert;
	}
	/**
	 * Fuegt einen Knoten als Kind des Aktuellen Knotens an
	 * 
	 * @param node ist der Knoten der als Kind hinzuzugefuegt wird
	 */
	public void addChild(Node node){
		this.childNodes.add(node);
	}
	/**
	 * Gibt den Namen des Knotens wieder
	 * @return name des Knotens
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * Gibt den Wert des Knotens wieder
	 * @return wert des Knotens
	 */
	public T getValue(){
		return (T) this.wert;
	}
	/**
	 * Gibt die Liste der Kinder des Knotens zurueck
	 * @return Liste der Kinder
	 */
	public NodeListImpl<Node<T>> getChildren(){
		return childNodes;
	}
	
	/**
	 * Formt einen String aus dem Name und dem Wert der Knotens
	 * @return Gibt den Name und den Wert des Knotens zurueck
	 */
	public String toString(){
		return this.name +" "+ this.wert;
	}

}
