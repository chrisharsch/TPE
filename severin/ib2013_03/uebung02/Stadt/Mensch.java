package ib2013_03.uebung02.Stadt;

/**
 * Superklasse Mensch erbt an Richter und Buerrger erbt von Einwohner
 * 
 * @author Severin Kohler, Chris Harsch
 * 
 */
public class Mensch extends Einwohner {
	private int alter;

	/**
	 * Konstruktor von Mensch
	 * 
	 * @param einkommen
	 * @param name
	 * @param alter
	 */
	public Mensch(String name, int einkommen, int alter) {
		super(einkommen, name);
		// TODO Auto-generated constructor stub
		this.alter = alter;
	}

	/**
	 * Dient zur lesbaren Ausgabe der Klasse und ihrer Variablen
	 */
	@Override
	public String toString() {
		return "Mensch [alter=" + alter + ", getName()=" + getName() + ", getEinkomme()=" + getEinkomme() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
