package components;

import static org.junit.Assert.*;
import lists.Node;

import org.junit.Test;

public class test {

	@Test
	public void test() {
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
				//Kinder von a anhängen
				a.addChild(b);
				a.addChild(c);
				a.addChild(d);
				//Kinder von b anhängen
				b.addChild(a);
				b.addChild(e);
				b.addChild(f);
				b.addChild(g);
				//Kinder von c anhängen
				e.addChild(h);
				e.addChild(i);
				//Kinder von f anhängen
				f.addChild(j);
				f.addChild(k);
				//Kinder von g anhängen
				g.addChild(d);
				//Kinder von h anhängen
				h.addChild(b);
				//Kinder von j anhängen
				j.addChild(i);
				//Kinder von k anhängen
				k.addChild(d);
				
				assertEquals("[k k]", z.search("Tiefensuche", "k").toString());
				assertEquals("[a a, b b, e e, h h, i i, f f, j j, k k, d d, g g, c c]", z.getPath().toString());
				
				assertEquals("[k k]", z.search("Breitensuche", "k").toString());
				assertEquals("[a a, b b, c c, d d, e e, f f, g g, h h, i i, j j, k k]", z.getPath().toString());
		
	}

}
