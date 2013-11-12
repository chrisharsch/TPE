package ib2013_03.uebung02.Stadt;

/**
 * Abstrakte Superklasse Mutant, erbt von Einwohner
 * 
 * @author Severin Kohler, Chris Harsch
 * 
 */
public abstract class Mutant extends Einwohner {
	private String mutation;

	/**
	 * Konstruktor von Mutant
	 * 
	 * @param name
	 * @param einkommen
	 * @param mutation
	 */
	public Mutant(String name, int einkommen, String mutation) {
		super(einkommen, name);
		this.mutation = mutation;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Abstrakte Methode kaempfen
	 * 
	 * @return
	 */
	public abstract boolean kaempfe(Mutant m);

	/**
	 * Dient zur leserlichen Ausgabe der Werte der Klasse
	 */
	@Override
	public String toString() {
		return "Mutant [mutation=" + mutation + ", getName()=" + getName() + ", getEinkomme()=" + getEinkomme() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
