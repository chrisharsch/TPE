package ib2013_03.uebung02.Stadt;

import ib2013_03.uebung02.Steuern.Gewerbesteuer;
import ib2013_03.uebung02.Steuern.Steuerechner;
import ib2013_03.uebung02.Steuern.Steuerpflichtig;

import java.util.LinkedList;

/**
 * Personengesellschaften erbt von Unternehmen implementiert Gewerbesteuer und
 * Steuerpflichtig
 * 
 * @author Severin Kohler, Chris Harsch
 * 
 */
public class Personengesellschaften extends Unternehmen implements Gewerbesteuer, Steuerpflichtig {

	private LinkedList<Buerger> inhaber = new LinkedList();

	/**
	 * Konstruktor von Personengesellschaften fügt die Klasse der Liste aller
	 * Instanzen hinzu
	 * 
	 * @param gewinn
	 * @param name
	 * @param inhaber
	 */
	public Personengesellschaften(int gewinn, String name, LinkedList inhaber) {
		super(gewinn, name);
		this.inhaber = inhaber;
		Metropolis.addListe(this);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Berechnet die Gewerbesteuer mit einem Abzug von 1000 Metrodollar, dabei
	 * kann die Zahl nicht negativ werden
	 * 
	 * @return berechneteGewerbesteuer
	 */
	@Override
	public int getGewerbesteuer() {
		int wert = super.getGewinn();
		if ((wert - 1000) > 0) {
			wert -= 1000;
		}
		return Steuerechner.berechneGewerbesteuer(wert);
	}

	/**
	 * Berechnet die Gesamtsteuer der Klasse, gSteuer ist im Interface der
	 * Klasse Steuerpflichtig hinterlegt
	 * 
	 * @return die Gesamtsteuer der Klasse
	 */
	@Override
	public int gSteuer() {
		return getGewerbesteuer();
	}

	/**
	 * Dient zur leserlichen Ausgabe der Werte der Klasse
	 */
	@Override
	public String toString() {
		return "Personengesellschaften [inhaber=" + inhaber + ", getGewerbesteuer()=" + getGewerbesteuer() + ", gSteuer()=" + gSteuer() + ", getName()=" + getName() + ", getGewinn()=" + getGewinn()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
