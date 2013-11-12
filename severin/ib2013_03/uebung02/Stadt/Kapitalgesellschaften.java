package ib2013_03.uebung02.Stadt;

import ib2013_03.uebung02.Steuern.Gewerbesteuer;
import ib2013_03.uebung02.Steuern.Koerperschaftsteuer;
import ib2013_03.uebung02.Steuern.Steuerechner;
import ib2013_03.uebung02.Steuern.Steuerpflichtig;

import java.util.LinkedList;

/**
 * Kapitalgesellschaften erbt von Unternehmen
 * 
 * @author Severin Kohler, Chris Harsch
 * 
 */
public class Kapitalgesellschaften extends Unternehmen implements Koerperschaftsteuer, Gewerbesteuer, Steuerpflichtig {
	private LinkedList<Buerger> gesellschafter = new LinkedList();

	/**
	 * Konstruktor von Kapitalgesellschaften, fügt implementierte
	 * Kapitalgesellschaften zu Liste aller Instanzen hinzu
	 * 
	 * @param gewinn
	 * @param name
	 * @param gesellschafter
	 */
	public Kapitalgesellschaften(int einkommen, String name, LinkedList gesellschafter) {
		super(einkommen, name);
		this.gesellschafter = gesellschafter;
		Metropolis.addListe(this);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Ruft eine Methode, in Steuerechner auf, die die Koerperschaftsteuer der
	 * Klasse berechnet
	 * 
	 * @return berechnete Koerperschaftsteuer
	 */
	@Override
	public int getKoerperschaftsteuer() {
		// TODO Auto-generated method stub
		return Steuerechner.berechneKoerperschaftsteuer(super.getGewinn());
	}

	/**
	 * Ruft eine Methode, in Steuerechner auf, die die Gewerbesteuer der Klasse
	 * berechnet
	 * 
	 * @return berechnete Gewerbesteuer
	 */
	@Override
	public int getGewerbesteuer() {
		return Steuerechner.berechneGewerbesteuer(super.getGewinn());
	}

	/**
	 * Berechnet die Gesamtsteuer der Klasse, gSteuer ist im Interface der
	 * Klasse Steuerpflichtig hinterlegt
	 * 
	 * @return die Gesamtsteuer der Klasse
	 */
	@Override
	public int gSteuer() {
		return getGewerbesteuer() + getKoerperschaftsteuer();
	}

	/**
	 * Dient zur leserlichen Ausgabe der Werte der Klasse
	 */
	@Override
	public String toString() {
		return "Kapitalgesellschaften [getName()=" + getName() + ", getGewinn()=" + getGewinn() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
