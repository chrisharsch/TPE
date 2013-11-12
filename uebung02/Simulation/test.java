package Simulation;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

import Einwohner.Buerger;
import Einwohner.Richter;
import Einwohner.Schurke;
import Einwohner.Superheld;
import Einwohner.Superkraft;
import Syndikat.Syndikat;
import Unternehmen.Kapitalgesellschaft;
import Unternehmen.Personengesellschaft;

public class test {

	@Test
	public void test() {
		
		
		Schurke schurke1 = new Schurke("Wolf", 60000, "5 Arme", Superkraft.AK47);
		Schurke schurke2 = new Schurke("Billard", 70000, "Monsterkopf", Superkraft.Adamantiumblut);
		Schurke schurke3 = new Schurke("Topper", 80000, "3 Beine", Superkraft.Laserblick);
		Schurke schurke4 = new Schurke("Lower", 90000, "Flieger", Superkraft.Flammenwerfer);
		Schurke schurke5 = new Schurke("Higher", 100000, "Taucher", Superkraft.Blizzard);
		
		Superheld superheld1 = new Superheld("Wolverine", 100000, "Stahlklingen",Superkraft.Adamantiumblut);
		Superheld superheld3 = new Superheld("Brain", 100000, "Monsterkopf",Superkraft.Laserblick);
		Superheld superheld5 = new Superheld("Chuck Norris", 1000000, "Hass",Superkraft.Adamantiumblut);
	
		
		Richter richter1 = new Richter("Horst Koehler", 100000, 20, true);
		Richter richter2 = new Richter("Horst Korupption", 100000, 32,false);
		
		Kapitalgesellschaft kapital = new Kapitalgesellschaft("Bulma Corp", 20000000);
		
		Personengesellschaft person = new Personengesellschaft("Google", 300000000);
		
		LinkedList<Schurke> hallo =new LinkedList();
		hallo.add(schurke1);
		hallo.add(schurke2);
		LinkedList<Schurke> h = new LinkedList();
		h.add(schurke5);
		h.add(schurke4);
		Syndikat syndikat1 = new Syndikat("Drosselcom", hallo);
		Syndikat syndikat2 = new Syndikat("Amazon", h);
		
		// Richter verurteilen
		assertFalse(richter1.veruteilen(schurke5));
		assertTrue(richter2.veruteilen(schurke2));
		
		//Superhelden Kampf
		assertFalse(superheld1.kaempfe(schurke4));
		assertTrue(superheld5.kaempfe(schurke2));
		//Schurken Kampf
		assertFalse(schurke3.kaempfe(superheld3));
		assertTrue(schurke1.kaempfe(superheld1));
		
		//Einkommensteuer Berechnung
		
		assertEquals(1000, new Buerger("Hans", 10000, 20).berechneESteuer());
		assertEquals(2000, new Buerger("Hans", 20000, 20).berechneESteuer());
		assertEquals(4500, new Buerger("Hans", 30000, 20).berechneESteuer());
		assertEquals(7000, new Buerger("Hans", 40000, 20).berechneESteuer());
		assertEquals(9500, new Buerger("Hans", 50000, 20).berechneESteuer());
		assertEquals(12000, new Buerger("Hans", 60000, 20).berechneESteuer());
		assertEquals(19000, new Buerger("Hans", 80000, 20).berechneESteuer());
		assertEquals(26000, new Buerger("Hans", 100000, 20).berechneESteuer());
		assertEquals(33000, new Buerger("Hans", 120000, 20).berechneESteuer());
		assertEquals(43000, new Buerger("Hans", 140000, 20).berechneESteuer());
		assertEquals(48000, new Buerger("Hans", 150000, 20).berechneESteuer());
		assertEquals(73000, new Buerger("Hans", 200000, 20).berechneESteuer());
		
		//Gewerbesteuer Berechnung
		
		assertEquals(0, new Personengesellschaft("Doris", 1000).berechneGSteuer());
		assertEquals(2000, new Personengesellschaft("Doris", 21000).berechneGSteuer());
		
		//Koerperschaftssteuer Berechnung
		
		assertEquals(2500, new Kapitalgesellschaft("jaššp", 10000).berechneKSteuer());
	}

}
