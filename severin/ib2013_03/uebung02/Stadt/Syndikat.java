package ib2013_03.uebung02.Stadt;

import ib2013_03.uebung02.Steuern.Koerperschaftsteuer;
import ib2013_03.uebung02.Steuern.Steuerechner;
import ib2013_03.uebung02.Steuern.Steuerpflichtig;

import java.util.LinkedList;

/**
 * Schurken Syndikat implementier die Interfaces Steuerpflichtig und
 * Koerperschaftsteuer
 * 
 * @author Severin Kohler, Chris Harsch
 * 
 */
public class Syndikat extends Instanz implements Steuerpflichtig, Koerperschaftsteuer {
	private String name;
	private LinkedList<Schurke> mitglieder = new LinkedList();
	private int syndikateinkommen;

	/**
	 * Konstruktor von Syndikat falls mitglieder nur aus 1nem Schurken besteht
	 * kann kein Syndikat gegründet werden da diese aus mehreren bestehen
	 * 
	 * @param name
	 * @param mitglieder
	 *            Liste aller Mitglieder
	 */
	public Syndikat(String name, LinkedList mitglieder) {
		super(name);
		if (mitglieder.size() > 1) {
			Metropolis.addListe(this);
			this.mitglieder = mitglieder;
		} else {
			throw new IllegalArgumentException("Ein Schurke allein kann sich nicht zu einem Syndikat zusammenschliessen!");
		}
	}

	/**
	 * Berechnet das Einkommen des Syndikats
	 * 
	 * @return syndikateinkommen
	 */
	public int getSyndikateinkommen() {
		syndikateinkommen = 0;
		for (Schurke s : mitglieder) {
			syndikateinkommen += s.getEinkomme();
		}
		return syndikateinkommen;

	}

	/**
	 * Gibt die List der Mitglieder zurück
	 * 
	 * @return mitglieder
	 */
	public LinkedList getMitglieder() {
		return mitglieder;
	}

	/**
	 * Ruft eine Methode in Steuerechner auf die die Koerperschaftsteuer
	 * berechnet und zurückgibt
	 * 
	 * @return berechnete Koerperschaftsteuer
	 */
	@Override
	public int getKoerperschaftsteuer() {
		// TODO Auto-generated method stub
		return Steuerechner.berechneKoerperschaftsteuer(getSyndikateinkommen());
	}

	/**
	 * Berechnet die Gesamtsteuer der Klasse, gSteuer ist im Interface der
	 * Klasse Steuerpflichtig hinterlegt
	 * 
	 * @return die Gesamtsteuer der Klasse
	 */
	@Override
	public int gSteuer() {
		return getKoerperschaftsteuer();
	}

	/**
	 * Dient zur leserlichen Ausgabe der Werte der Klasse
	 */
	@Override
	public String toString() {
		return "Syndikat [name=" + name + ", mitglieder=" + mitglieder + ", syndikateinkommen=" + syndikateinkommen + ", getSyndikateinkommen()=" + getSyndikateinkommen() + ", getMitglieder()="
				+ getMitglieder() + ", getKoerperschaftsteuer()=" + getKoerperschaftsteuer() + ", gSteuer()=" + gSteuer() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
