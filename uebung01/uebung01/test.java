package uebung01;
import static org.junit.Assert.*;

public class test {

	@org.junit.Test
	public void test() {
		// Deziaml
		
		assertEquals(9.5, new Bruch(19, 2).getDezimalzahl(), 0.1);
		assertEquals(8.0, new Bruch(16, 2).getDezimalzahl(), 0.1);
		assertEquals(0.5, new Bruch(5, 10).getDezimalzahl(), 0.1);
		
		//unechter Bruch
		
		assertEquals(new Bruch(3,4), new Bruch(3,4).unechterBruch());
		assertEquals(new Bruch(9, 5), new Bruch(1,4,5).unechterBruch());
		assertEquals(new Bruch(8,3),new Bruch(2,2,3).unechterBruch());
		
		// echter Bruch
		
		Bruch bruch2 = new Bruch(47, 5);
		assertEquals(new Bruch(3,4), new Bruch(3,4).echterBruch());
		assertEquals(new Bruch(9, 2, 5), bruch2.echterBruch());
		assertEquals(new Bruch(4, 3, 5), new Bruch(23, 5).echterBruch());
		
		// Addition
		
		assertEquals(new Bruch(3, 6), new Bruch(1, 6).addiere(new Bruch(2, 6)));
		//assertEquals(new Bruch(2, 5), new Bruch(1, 5).addiere(new Bruch(1, 5)));
		//assertEquals(new Bruch(8, 10), new Bruch(2, 10).addiere(new Bruch(3, 5)));
		
		// Subtraktion
		
		assertEquals(new Bruch(2, 15), new Bruch(3, 10).substrahiere(new Bruch(1, 6)));
		assertEquals(new Bruch(1, 5), new Bruch(2, 5).substrahiere(new Bruch(1, 5)));
		assertEquals(new Bruch(3, 5), new Bruch(8, 10).substrahiere(new Bruch(2, 10)));
		
		// Multiplikation
		
		assertEquals(new Bruch(3, 60), new Bruch(3, 10).multipliziere(new Bruch(1, 6)));
		assertEquals(new Bruch(15, 6), new Bruch(3, 6).multipliziere(5));
		
		// Division
		
		assertEquals(new Bruch(3, 10), new Bruch(3, 60).dividiere(new Bruch(1, 6)));
		assertEquals(new Bruch(3, 600), new Bruch(3, 60).dividiere(10));
		
		// Potenzieren
		
		assertEquals(1, new Bruch(2, 3).potenziere(0).getGanze());
		assertEquals(new Bruch(2, 3), new Bruch(2, 3).potenziere(1));
		assertEquals(new Bruch(4, 9), new Bruch(2, 3).potenziere(2));
		assertEquals(new Bruch(8, 27), new Bruch(2, 3).potenziere(3));
		
		}

}
