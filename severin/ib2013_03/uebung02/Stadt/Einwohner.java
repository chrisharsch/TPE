package ib2013_03.uebung02.Stadt;

/**
 * Die Klasse Einwohner erbt von Instanz
 * 
 * @author Severin Kohler, Chris Harsch
 * 
 */
public class Einwohner extends Instanz {
	private int einkommen;
	private String name;

	/**
	 * Konstruktor der Superklasse
	 * 
	 * @param einkommen
	 * @param name
	 */
	public Einwohner(int einkommen, String name) {
		super(name);
		this.einkommen = einkommen;
	}

	/**
	 * Gibt das Einkommen zur�ck
	 * 
	 * @return einkommen
	 */
	public int getEinkomme() {
		return this.einkommen;
	}

	@Override
	/**
	 * Gibt die Klasse lesbar zur�ck
	 * @return Klasse alls "String"
	 */
	public String toString() {
		return "Instanz [einkommen=" + einkommen + ", name=" + name + "]";
	}
}
