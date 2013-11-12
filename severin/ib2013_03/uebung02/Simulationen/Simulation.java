package ib2013_03.uebung02.Simulationen;

import java.io.ObjectInputStream.GetField;
import java.util.LinkedList;

import ib2013_03.uebung02.Stadt.Buerger;
import ib2013_03.uebung02.Stadt.Kapitalgesellschaften;
import ib2013_03.uebung02.Stadt.Metropolis;
import ib2013_03.uebung02.Stadt.Personengesellschaften;
import ib2013_03.uebung02.Stadt.Richter;
import ib2013_03.uebung02.Stadt.Schurke;
import ib2013_03.uebung02.Stadt.Superheld;
import ib2013_03.uebung02.Stadt.Superkraefte;
import ib2013_03.uebung02.Stadt.Syndikat;
import ib2013_03.uebung02.Steuern.*;

public class Simulation {

	public static void main(String[] args) {
		
		//Stadt erstellen
		Metropolis metropolis = new Metropolis();
		
		//Superkraefte für einen Helden anlegen
		LinkedList<Superkraefte> superkraefteliste1 = new LinkedList();
		superkraefteliste1.add(Superkraefte.FEUERATEM);
		superkraefteliste1.add(Superkraefte.ROUNDHOUSEKICK);
		Superheld klaus = new Superheld("Klaus", 40000, "4Augen", superkraefteliste1);

		//Superkraefte für einen zewiten Helden anlegen
		LinkedList<Superkraefte> superkraefteliste2 = new LinkedList();
		superkraefteliste2.add(Superkraefte.ZERMALMER);
		superkraefteliste2.add(Superkraefte.STAHLFAUST);
		Superheld herrmann = new Superheld("Hermann", 30000, "3Arme", superkraefteliste2);
		
		//Schurken erstellen
		Schurke fritz = new Schurke("Fritz", 60000, "4Beine", Superkraefte.STAHLFAUST);
		Schurke heinz = new Schurke("Heinz", 80000, "4Brustwarzen", Superkraefte.EXMATRIKULATION);
		Schurke kuh = new Schurke("Kuh", 40000, "3Augen", Superkraefte.FLIEGEN);
		
		//Syndikat erzeugen
		LinkedList<Schurke> zusammenschluss = new LinkedList();
		zusammenschluss.add(heinz);
		zusammenschluss.add(fritz);
		Syndikat hater = new Syndikat("4hater", zusammenschluss);
		
		//Richter und Buerger anlegen
		Richter barbara = new Richter("Barbara Salesch", 100000, 56, true);
		Richter manuel = new Richter("Manuel", 100000, 12, false);
		Buerger ulf = new Buerger("Ulf", 50000, 30);
		Buerger siegfried = new Buerger("Siegfried", 60000, 25);
		
		//Liste mit Buergern anlegen
		LinkedList<Buerger> bliste1 = new LinkedList();
		bliste1.add(ulf);
		bliste1.add(siegfried);
		
		//Unternehmen mit der Liste erzeugen
		Personengesellschaften entenheimer = new Personengesellschaften(70000, "Entenheimer", bliste1);
		Kapitalgesellschaften usa = new Kapitalgesellschaften(100000, "Usa", bliste1);
		
		//Alle Steuerpflichtigen in Metropolis in die Liste des Finanzamts schreiben
		metropolis.getFinanzamt().addSteuerplflichtiger();
		
		//Überprüfen des Ergebnis der gesamten Steuern durch x
		int x=0;
		x+=fritz.gSteuer();
		x+=heinz.gSteuer();  
		x+=kuh.gSteuer();
		x+=hater.gSteuer();
		x+=ulf.gSteuer();
		x+=siegfried.gSteuer();
		x+=entenheimer.gSteuer();
		x+=usa.gSteuer();
		System.out.println(x);
		
		//Ausgabe der Steuerberechnungsmethode
		System.out.println(metropolis.getFinanzamt().gesamtSteuer());
		
		// Tests der Methoden von Richtern, Schurken und Superhelden
		System.out.println(barbara.verurteilen(kuh));
		System.out.println(manuel.verurteilen(heinz));
		System.out.println(klaus.kaempfe(heinz));
		System.out.println(klaus.kaempfe(fritz));
		System.out.println(herrmann.kaempfe(fritz));
		System.out.println(herrmann.kaempfe(kuh));
	}

}