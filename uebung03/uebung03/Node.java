package uebung03;

import java.util.LinkedList;

public class Node<T> {
	private String name;
	private T wert;
	private NodeListImpl<Node<T>> childNodes = new NodeListImpl<Node<T>>(); //Nur die Kinder dieses Knotens keine Kindeskinder
	Node(String name, T wert){
		this.name=name;
		this.wert = wert;
	}
	public void addChild(Node node){
		this.childNodes.add(node);
	}
	public String getName(){
		return this.name;
	}
	public T getValue(){
		return (T) this.wert;
	}
	public NodeListImpl<Node<T>> getChildren(){
		return childNodes;
	}
	public String toString(){
		return this.name +" "+ this.wert;
	}

}
