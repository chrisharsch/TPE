package ib2013_03.uebung02.Stadt;

import java.util.LinkedList;

/**
 * Superheld erbt von Mutant
 * 
 * @author Severin Kohler, Chris Harsch
 * 
 */
public class Superheld extends Mutant {
	private LinkedList<Superkraefte> superkraefte = new LinkedList();

	/**
	 * Konstruktor von Superheld
	 * 
	 * @param name
	 * @param einkommen
	 * @param mutation
	 * @param Liste
	 *            der superkraefte
	 */
	public Superheld(String name, int einkommen, String mutation, LinkedList superkraefte) {
		super(name, einkommen, mutation);
		this.superkraefte = superkraefte;
	}

	/**
	 * Gibt die Liste der Superkraefte zurück
	 * 
	 * @return superkraefte
	 */
	public LinkedList<Superkraefte> getSuperkraefte() {
		return superkraefte;
	}

	/**
	 * Prüft ob Mutant Schurke ist, falls ja wird geprüft ob der Superheld eine
	 * Superkraft hat, die mit der des Schurken identisch ist.
	 * 
	 * @return gebe zurück falls gleich true(gewinnt) ungleich false und wenn
	 *         Mutant kein Schurke ist eine Fehlermeldung
	 */
	@Override
	public boolean kaempfe(Mutant m) {
		if (m instanceof Schurke) {
			return !m.kaempfe(this);
			// return this.superkraefte.contains(((Schurke) m).getSuperkraft());
		}
		throw new IllegalArgumentException("Mutant ist kein Schurke!");
	}

	/**
	 * Dient zur leserlichen Ausgabe der Werte der Klasse
	 */
	@Override
	public String toString() {
		return "Superheld [superkraefte=" + superkraefte + ", getSuperkraefte()=" + getSuperkraefte() + ", toString()=" + super.toString() + ", getName()=" + getName() + ", getEinkomme()="
				+ getEinkomme() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
