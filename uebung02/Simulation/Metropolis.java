package Simulation;

import Steuern.*;
import Syndikat.*;
import Unternehmen.*;
import Einwohner.*;

import java.util.LinkedList;


public class Metropolis {

	public static void main(String[] args) {
		Finanzamt f = new Finanzamt();
				
		Buerger buerger1 = new Buerger("Horst", 10000, 24);
		Buerger buerger2 = new Buerger("Thorsten", 20000, 43);
		Buerger buerger3 = new Buerger("Peter", 30000, 33);
		Buerger buerger4 = new Buerger("Paul", 40000, 32);
		Buerger buerger5 = new Buerger("Hans", 50000, 21);
		
		Schurke schurke1 = new Schurke("Wolf", 60000, "5 Arme", Superkraft.AK47);
		Schurke schurke2 = new Schurke("Billard", 70000, "Monsterkopf", Superkraft.Adamantiumblut);
		Schurke schurke3 = new Schurke("Topper", 80000, "3 Beine", Superkraft.Laserblick);
		Schurke schurke4 = new Schurke("Lower", 90000, "Flieger", Superkraft.Flammenwerfer);
		Schurke schurke5 = new Schurke("Higher", 100000, "Taucher", Superkraft.Blizzard);
		
		Superheld superheld1 = new Superheld("Wolverine", 100000, "Stahlklingen",Superkraft.Adamantiumblut);
		Superheld superheld2 = new Superheld("Thor", 100000, "Wackelpudding",null);
		Superheld superheld3 = new Superheld("Brain", 100000, "Monsterkopf",Superkraft.Laserblick);
		Superheld superheld4 = new Superheld("Magneto", 100000, "",Superkraft.Blizzard);
		Superheld superheld5 = new Superheld("Chuck Norris", 1000000, "Hass",Superkraft.Adamantiumblut);
		
		superheld5.addSuperkraefte(Superkraft.AK47);
		superheld5.addSuperkraefte(Superkraft.Blizzard);
		superheld5.addSuperkraefte(Superkraft.ChuckNorris);
		superheld5.addSuperkraefte(Superkraft.Flammenwerfer);
		superheld5.addSuperkraefte(Superkraft.Laserblick);
		superheld5.addSuperkraefte(Superkraft.ThorsHammer);
		superheld2.addSuperkraefte(Superkraft.ThorsHammer);
		
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
		
		
		
		f.addSteuerpflichtiger(buerger5);
		f.addSteuerpflichtiger(buerger4);
		f.addSteuerpflichtiger(buerger3);
		f.addSteuerpflichtiger(buerger2);
		f.addSteuerpflichtiger(buerger1);
		f.addSteuerpflichtiger(schurke5);
		f.addSteuerpflichtiger(schurke4);
		f.addSteuerpflichtiger(schurke3);
		f.addSteuerpflichtiger(schurke2);
		f.addSteuerpflichtiger(schurke1);
		
		f.addSteuerSyndikat(syndikat1);
		f.addSteuerSyndikat(syndikat2);
		
		f.addSteuerUnternehmen(person);
		f.addSteuerUnternehmen(kapital);
		
		richter1.veruteilen(schurke5);
		richter2.veruteilen(schurke2);
		
		superheld1.kaempfe(schurke4);
		schurke3.kaempfe(superheld3);
		superheld5.kaempfe(schurke2);
		//schurke1.kaempfe(schurke2);
		//superheld2.kaempfe(superheld4);
		
		kapital.addGesellschafter(buerger5);
		kapital.addGesellschafter(buerger4);
		
		person.addInhaber(buerger3);
		person.addInhaber(buerger2);
		person.addInhaber(buerger1);
		
	}

}
