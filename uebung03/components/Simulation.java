package components;

import lists.Node;
/**
 * Simulation des gegebenen Graphen
 * @author Chris Harsch und Severin Kohler
 *
 */
public class Simulation {
	public static void main(String[] args) {
		
		//Einzelne Knoten erzeugen
		Node<String> a = new Node<String>("a", "a");
		Node<String> b = new Node<String>("b", "b");
		Node<String> c = new Node<String>("c", "c");
		Node<String> d = new Node<String>("d", "d");
		Node<String> e = new Node<String>("e", "e");
		Node<String> f = new Node<String>("f", "f");
		Node<String> g = new Node<String>("g", "g");
		Node<String> h = new Node<String>("h", "h");
		Node<String> i = new Node<String>("i", "i");
		Node<String> j = new Node<String>("j", "j");
		Node<String> k = new Node<String>("k", "k");
		//Aus a einen Graphen machen
		Graph z = new Graph(a);
		//Kinder von a anh�ngen
		a.addChild(b);
		a.addChild(c);
		a.addChild(d);
		//Kinder von b anh�ngen
		b.addChild(a);
		b.addChild(e);
		b.addChild(f);
		b.addChild(g);
		//Kinder von c anh�ngen
		e.addChild(h);
		e.addChild(i);
		//Kinder von f anh�ngen
		f.addChild(j);
		f.addChild(k);
		//Kinder von g anh�ngen
		g.addChild(d);
		//Kinder von h anh�ngen
		h.addChild(b);
		//Kinder von j anh�ngen
		j.addChild(i);
		//Kinder von k anh�ngen
		k.addChild(d);
		//Verscheidene Suchmethoden anwenden
		System.out.println("Tiefensuche: " +z.search("Tiefensuche", "k"));
		System.out.println(z.getPath());
		System.out.println("Breitensuche: " +z.search("Breitensuche", "k"));
		System.out.println(z.getPath());
	}
}
