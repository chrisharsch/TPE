package ib2013_03.uebung02.Stadt;

import ib2013_03.uebung02.Steuern.Einkommensteuer;
import ib2013_03.uebung02.Steuern.Steuerechner;
import ib2013_03.uebung02.Steuern.Steuerpflichtig;

/**
 * Klasse Schurke erbt von Mutant hat die Interfaces Einkommensteuer und
 * Steuerpflichtig
 * 
 * @author Severin Kohler, Chris Harsch
 * 
 */
public class Schurke extends Mutant implements Einkommensteuer, Steuerpflichtig {

	private Superkraefte superkraft;

	/**
	 * Kontruktor von Schurke hat nur eine Superkraft
	 * 
	 * @param name
	 * @param einkommen
	 * @param mutation
	 * @param superkraft
	 */
	public Schurke(String name, int einkommen, String mutation, Superkraefte superkraft) {
		super(name, einkommen, mutation);
		this.superkraft = superkraft;
		Metropolis.addListe(this);
	}

	/**
	 * Gibt die Superkraft des Schurken zurück
	 * 
	 * @return superkraft
	 */
	public Superkraefte getSuperkraft() {
		return superkraft;
	}

	/**
	 * Prüft ob Mutant Superheld ist, falls ja wird geprüft ob der Superheld
	 * eine Superkraft hat, die mit der des Schurken identisch ist.
	 * 
	 * @return gebe zurück falls gleich true ungleich false und wenn Mutant kein
	 *         superheld ist eine Fehlermeldung
	 */
	@Override
	public boolean kaempfe(Mutant m) {
		if (m instanceof Superheld) {
			return !((Superheld) m).getSuperkraefte().contains(this.superkraft);
		}
		throw new IllegalArgumentException("Mutant ist kein Superheld");
	}

	/**
	 * Berechnet über Steuerechner die Einkommensteuer von der Klasse hierbei
	 * wird das einkommen der Klasse übergeben
	 * 
	 * @return zurückgegeben wird die berechnete jeweilige Steuer
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
	 * Gibt alle Variablen und ihre Werte der Klasse in lesbarerform zurück
	 */
	@Override
	public String toString() {
		return "Schurke [superkraft=" + superkraft + ", getSuperkraft()=" + getSuperkraft() + ", getName()=" + getName() + ", getEinkomme()=" + getEinkomme() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
