package ib2013_03.uebung02.Stadt;

/**
 * Richter erbt von Mensch
 * 
 * @author Severin Kohler, Chris Harsch
 * 
 */

public class Richter extends Mensch {
	private boolean korrupt;

	/**
	 * Konstruktor von Richter
	 * 
	 * @param name
	 * @param einkommen
	 * @param alter
	 * @param korrupt
	 */
	public Richter(String name, int einkommen, int alter, boolean korrupt) {
		super(name, einkommen, alter);
		this.korrupt = korrupt;
		Metropolis.addListe(this);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Wenn der Richter Korrupt ist dann verurteilt er den Schurken nicht falls
	 * nicht wird der Schurke verurteilt
	 * 
	 * @return true oder false wenn Korrupt oder nicht Korrupt
	 */
	public boolean verurteilen(Schurke s) {
		if (korrupt) {
			return false;
		}
		return true;
	}

	/**
	 * Dient zur leserlichen Ausgabe der Werte der Klasse
	 */
	@Override
	public String toString() {
		return "Richter [korrupt=" + korrupt + ", toString()=" + super.toString() + ", getName()=" + getName() + ", getEinkomme()=" + getEinkomme() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
