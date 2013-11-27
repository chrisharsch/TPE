package components;

import java.util.LinkedList;

import lists.Node;
import lists.NodeListImpl;
import search.Breitensuche;
import search.SearchStrategy;
import search.Tiefensuche;
/**
 * Generische Klasse Graph, dieser hat 3 funktionen, suche, gebe den Pfad der Suche aus und 
 * Kopiere eine Liste aus Knoten in eine andere Liste.
 * @author Chris Harsch und Severin Kohler
 * @param <T>
 */
public class Graph<T> implements SearchStrategy<T>{
	
	private Node start;
	private Tiefensuche tief = new Tiefensuche<T>();
	private Breitensuche breit = new Breitensuche<T>();
	private String name;
/**
 * Konstruktor des Graphen hierbei wird der Startknoten bestimmt
 * @param node Wert der dem Startknoten zugewiesen wird
 */
	public Graph(Node node) {
		this.start = node;
		
	}
	
/**Kopiert in eine von außen übergebene Liste alle Knoten
 * 
 * @param nodelist übergebene Liste in die Kopiert wird
 */
	public void copyInto(NodeListImpl<T> nodelist) {
		NodeListImpl<T> visited = new NodeListImpl<T>();
		copyInto(nodelist, start, visited);
	}
/**
 * Dient zum Rekursiven Aufruf, kopiert die Knoten in eine von außen übergebene Liste
 * @param nodelist Liste in der die Knoten kopiert werden
 * @param node Übergabe Wert beim ersten Aufruf noch der Startknoten danach nur die Folgeknoten 
 * @param visited Liste aller Knoten die schon kopiert wurden, dient zur vorbeugung von mehrfach kopie der Knoten
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
 * Such-Methode hierbei kann die Art der Suche,per Eingabe des Suchnamens, bestimmt werden es wird 
 * gewaehlt zwischen Tiefensuche und Breitensuche
 * @param node generischer Typ hier der Name der Suchfunktion 
 * @param toSearch zusuchender Wert
 * @return gubt die Knoten indennen der Wert vorhanden ist aus, bei Falscheingabe des namens fehlermeldung
 */
	@Override
	public NodeListImpl<Node<T>> search(T node, T toSearch) {
		NodeListImpl<Node<T>> nodelist = new NodeListImpl<Node<T>>();
		this.name = (String) node;
		if (name.equals("Tiefensuche")) {
			return tief.search(start, toSearch);
		} else if (name.equals("Breitensuche")) {
			return breit.search(start, toSearch);
		} else {
			throw new IllegalArgumentException("Falscher Name f�r die Suche", entweder Tiefensuche oder Breitensuche");
		}
	}
/**
 * Gibt den Suchpfad des letzten aufrufs von search zurück
 * @return den Suchpfad der letzten suche
 */
 @Override
	public NodeListImpl<Node> getPath() {
		if (this.name.equals("Tiefensuche")) {
			return tief.getPath();
		}
		return breit.getPath();

	}



}
