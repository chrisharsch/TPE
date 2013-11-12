package ib2013_03.uebung02.Simulationen;

import static org.junit.Assert.*;

import ib2013_03.uebung02.Stadt.*;

import java.util.LinkedList;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		LinkedList<Superkraefte> l = new LinkedList();
		LinkedList<Buerger> b = new LinkedList();
		b.add(new Buerger("Wilhelm", 10000, 30));
		l.add(Superkraefte.EXMATRIKULATION);
		l.add(Superkraefte.FLIEGEN);
		
		// Schurke kaempfen
		assertTrue(new Schurke("klaus", 1000, "3arme", Superkraefte.ROUNDHOUSEKICK).kaempfe(new Superheld("Frieder", 1000, "doppelfaust", l)));
		assertFalse(new Schurke("klaus", 1000, "3arme", Superkraefte.EXMATRIKULATION).kaempfe(new Superheld("Frieder", 1000, "doppelfaust", l)));
		
		// Superheld kämpfen
		assertTrue(new Superheld("klaus", 1000, "3arme", l).kaempfe(new Schurke("Frieder", 1000, "doppelfaust", Superkraefte.EXMATRIKULATION)));
		assertFalse(new Superheld("klaus", 1000, "3arme", l).kaempfe(new Schurke("Frieder", 1000, "doppelfaust", Superkraefte.ZERMALMER)));
		
		// Richter
		assertFalse(new Richter("klaus", 1000, 30, true).verurteilen(new Schurke("Frieder", 1000, "doppelfaust", Superkraefte.ZERMALMER)));
		assertTrue(new Richter("klaus", 1000, 30, false).verurteilen(new Schurke("Frieder", 1000, "doppelfaust", Superkraefte.ZERMALMER)));
		
		// ----Buerger---
		assertEquals(1000, new Buerger("Wilhelm", 10000, 30).getEinkommensteuer());
		assertEquals(2000, new Buerger("Wilhelm", 20000, 30).getEinkommensteuer());
		assertEquals(4500, new Buerger("Wilhelm", 30000, 30).getEinkommensteuer());
		assertEquals(7000, new Buerger("Wilhelm", 40000, 30).getEinkommensteuer());
		assertEquals(9500, new Buerger("Wilhelm", 50000, 30).getEinkommensteuer());
		assertEquals(12000, new Buerger("Wilhelm", 60000, 30).getEinkommensteuer());
		assertEquals(19000, new Buerger("Wilhelm", 80000, 30).getEinkommensteuer());
		assertEquals(26000, new Buerger("Wilhelm", 100000, 30).getEinkommensteuer());
		assertEquals(33000, new Buerger("Wilhelm", 120000, 30).getEinkommensteuer());
		assertEquals(43000, new Buerger("Wilhelm", 140000, 30).getEinkommensteuer());
		assertEquals(48000, new Buerger("Wilhelm", 150000, 30).getEinkommensteuer());
		assertEquals(73000, new Buerger("Wilhelm", 200000, 30).getEinkommensteuer());
		
		// ---Steuern---
		assertEquals(4000, new Kapitalgesellschaften(40000, "xygmbh", b).getGewerbesteuer());
		assertEquals(10000, new Kapitalgesellschaften(40000, "xygmbh", b).getKoerperschaftsteuer());
		assertEquals(3900, new Personengesellschaften(40000, "xygmbh", b).getGewerbesteuer());
	}

}
