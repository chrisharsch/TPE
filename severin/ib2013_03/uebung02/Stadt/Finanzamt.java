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
	private LinkedList<Instanz> steuerpflichtige = new LinkedList();

	/**
	 * �berpr�ft die Liste aller Instanzen von Metropolis ob jene
	 * Steuerpflichtig sind falls ja f�ge sie der Liste der Steuerpflichtigen
	 * hinzu
	 */
	public void addSteuerplflichtiger() {
		for (Instanz instanz : Metropolis.getListe()) {
			if (instanz instanceof Steuerpflichtig) {
				steuerpflichtige.add(instanz);
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
		for (Instanz instanz : steuerpflichtige) {
			if (instanz instanceof Buerger) {
				gesamt += ((Buerger) instanz).gSteuer();
			} else if (instanz instanceof Syndikat) {
				gesamt += ((Syndikat) instanz).gSteuer();
			} else if (instanz instanceof Kapitalgesellschaften) {
				gesamt += ((Kapitalgesellschaften) instanz).gSteuer();
			} else if (instanz instanceof Personengesellschaften) {
				gesamt += ((Personengesellschaften) instanz).gSteuer();
			} else {

				gesamt += ((Schurke) instanz).gSteuer();
			}
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
