package Steuern;

import java.util.LinkedList;

import Einwohner.Buerger;
import Einwohner.Einwohner;
import Einwohner.Schurke;
import Syndikat.Syndikat;
import Unternehmen.Kapitalgesellschaft;
import Unternehmen.Personengesellschaft;
import Unternehmen.Unternehmen;

public class Finanzamt {
	private LinkedList<Instanz> Steuerliste = new LinkedList();

	public void addSteuerpflichtiger(Einwohner e) {
		Steuerliste.add(e);
	}

	public void addSteuerUnternehmen(Unternehmen u) {
		Steuerliste.add(u);
	}

	public void addSteuerSyndikat(Syndikat s) {
		Steuerliste.add(s);
	}

	public long berechneGesamtSteuer() {
		long summe = 0;
		for (Instanz i : Steuerliste) {
			if (i instanceof Buerger) {

				summe += ((Buerger) i).berechneESteuer();
			} else if (i instanceof Syndikat) {

				summe += ((Syndikat) i).berechneKSteuer();
			} else if (i instanceof Schurke) {

				summe += ((Schurke) i).berechneESteuer();
			} else if (i instanceof Personengesellschaft) {
			
				summe += ((Personengesellschaft) i).berechneESteuer();
				summe += ((Personengesellschaft) i).berechneGSteuer();
			} else if (i instanceof Kapitalgesellschaft) {
				
				summe += ((Kapitalgesellschaft) i).berechneKSteuer();
				summe += ((Kapitalgesellschaft) i).berechneGSteuer();
			}
		}

		return summe;
	}

}
