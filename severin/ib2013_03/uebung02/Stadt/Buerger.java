package ib2013_03.uebung02.Stadt;

import ib2013_03.uebung02.Simulationen.*;
import ib2013_03.uebung02.Steuern.Einkommensteuer;
import ib2013_03.uebung02.Steuern.Steuerechner;
import ib2013_03.uebung02.Steuern.Steuerpflichtig;

/**
 * Klasse Buerger erbt von Mensch implementiert die Interfaces Einkommensteuer
 * und Steuerpflichtig
 * 
 * @author Severin Kohler, Chris Harsch
 * 
 */
public class Buerger extends Mensch implements Einkommensteuer, Steuerpflichtig {
	/**
	 * Konstruktor Buerger, fügt Bürger zur Liste, der Instanzen, der Stadt
	 * hinzu
	 * 
	 * @param name
	 * @param einkommen
	 * @param alter
	 */
	public Buerger(String name, int einkommen, int alter) {
		super(name, einkommen, alter);
		Metropolis.addListe(this);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gehe arbeiten
	 * 
	 * @return Schaffe Schaffe Häusle baue
	 */
	public static String arbeiten() {
		return "Schaffe Schaffe Häusle baue";
	}

	/**
	 * Ruft die Methode berechneEinkommensteuer in Steuerechner auf die dann die
	 * Einkommensteuer berechnet und jene zurückliefert
	 * 
	 * @return berechnete Einkommensteuer
	 */
	@Override
	public int getEinkommensteuer() {
		return Steuerechner.berechneEinkommensteuer(super.getEinkomme());
	}

	/**
	 * Berechnet die Gesamtsteuer der Klasse, gSteuer ist im Interface der
	 * Klasse Steuerpflichtig hinterlegt
	 * 
	 * @return die Gesamtsteuer der Klasse
	 */
	@Override
	public int gSteuer() {
		return getEinkommensteuer();
	}

	/**
	 * Dient dazu die Klass mit all ihren variablen in lesbarerform
	 * wiederzugeben
	 */
	@Override
	public String toString() {
		return "Buerger [getEinkommensteuer()=" + getEinkommensteuer() + ", gSteuer()=" + gSteuer() + ", toString()=" + super.toString() + ", getName()=" + getName() + ", getEinkomme()="
				+ getEinkomme() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
