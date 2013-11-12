package ib2013_03.uebung02.Stadt;

/**
 * Metropolis ist die Stadt an sich, sie hat eine Liste aller Instanzen und ein Finanzamt
 * @autor Severin Kohler, Chris Harsch
 */
import java.util.LinkedList;

public class Metropolis {
	/**
	 * Statische Liste aller Instanzen
	 */
	private static LinkedList<Instanz> liste = new LinkedList();
	private Finanzamt finanzamt = new Finanzamt();

	/**
	 * Konstruktor von Metropolis
	 */
	public Metropolis() {
	}

	/**
	 * Gibt Finanzamt zur�ck
	 * 
	 * @return Finanzamt
	 */
	public Finanzamt getFinanzamt() {
		return finanzamt;
	}

	/**
	 * F�ge der Liste eine Instanz hinzu
	 * 
	 * @param s
	 */
	public static void addListe(Instanz s) {

		liste.add(s);
	}

	/**
	 * Gebe die Liste zur�ck
	 * 
	 * @return Liste aller Instanzen
	 */
	public static LinkedList<Instanz> getListe() {
		return liste;
	}
}
