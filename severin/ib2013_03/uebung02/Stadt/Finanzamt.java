package ib2013_03.uebung02.Stadt;

/**
 * Finanzamt hat eine Liste aller Steuerpflichtigen Instanzen und 
 * kann eine live ausgabe aller Steuern liefern
 * @author Severin Kohler, Chris Harsch
 * 
 */
import ib2013_03.uebung02.Steuern.Steuerpflichtig;

import java.awt.List;
import java.util.LinkedList;

public class Finanzamt {
	private LinkedList<Steuerpflichtig> steuerpflichtige = new LinkedList();

	/**
	 * Überprüft die Liste aller Instanzen von Metropolis ob jene
	 * Steuerpflichtig sind falls ja füge sie der Liste der Steuerpflichtigen
	 * hinzu
	 */
	public void addSteuerplflichtiger() {
		for (Instanz instanz : Metropolis.getListe()) {
			if (instanz instanceof Steuerpflichtig) {
				steuerpflichtige.add((Steuerpflichtig) instanz);
			}
		}
	}

	/**
	 * Berechnet die Steuer aller Steuerpflichtigen bzw die Gesmatsteuer der
	 * Stadt
	 * 
	 * @return gesamt, die Gesamtsteuer
	 */
	public int gesamtSteuer() {
		int gesamt = 0;
		for (Steuerpflichtig instanz : steuerpflichtige) {
			gesamt += instanz.gSteuer();
			
		}
		return gesamt;
	}

	/**
	 * Gibt die Klasse in leserlicherform wieder damit diese mit allen
	 * parametern ausgegeben werden kann
	 */
	@Override
	public String toString() {
		return "Finanzamt [steuerpflichtige=" + steuerpflichtige + ", gesamtSteuer()=" + gesamtSteuer() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
