package uebung03;

import java.util.LinkedList;

public class a {

	public static void main(String[] args) {
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
		Node<String> l = new Node<String>("l", "l");
		Node<String> m = new Node<String>("m", "m");
		Node<String> n = new Node<String>("n", "n");
		Node<String> o = new Node<String>("o", "o");
		Node<String> p = new Node<String>("p", "p");
		
		a.addChild(b);
		a.addChild(c);
		a.addChild(d);
		b.addChild(e);
		b.addChild(f);
		b.addChild(g);
		e.addChild(h);
		e.addChild(i);
		f.addChild(j);
		f.addChild(k);
		c.addChild(l);
		c.addChild(m);
		m.addChild(n);
		d.addChild(o);
		d.addChild(p);
		
		Graph hallo = new Graph(a);
		System.out.println( hallo.search("Breitensuche", l));
		System.out.println(hallo.getPath());
		System.out.println(hallo.search("Tiefensuche", k));
		System.out.println(hallo.getPath());
		/*
		LinkedList u = new LinkedList(a.getChildren());
		
		System.out.println( u.toString());*/
	}

}
