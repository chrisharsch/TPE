package ib2013_03.uebung02.Steuern;

/**
 * Steuerechnet beeinhalted alle berechnungen der Steuern und kann diese
 * Berechnen
 * 
 * @author Severin Kohler, Chris Harsch
 * 
 */
public class Steuerechner {
	/**
	 * Dient zur Berechnung der Einkommensteuer
	 * 
	 * @param einkommen
	 *            der Klasse wird übergeben
	 * @return Berechnete Einkommensteuer
	 */
	public static int berechneEinkommensteuer(int einkommen) {
		int wert = einkommen;
		int steuer = 0;
		if (wert <= 20000) {
			return (wert / 100) * 10;
		} else {
			steuer += ((20000 / 100) * 10);
			wert -= 20000;
			if (wert <= 40000) {
				return steuer += ((wert / 100) * 25);
			} else {
				steuer += ((40000 / 100) * 25);
				wert -= 40000;
				if (wert <= 60000) {
					return steuer += (wert / 100) * 35;
				} else {
					steuer += ((60000 / 100) * 35);
					wert -= 60000;
					if (wert > 1) {
						return steuer += ((wert / 100) * 50);
					} else {
						return steuer;
					}
				}

			}
		}
	}

	/**
	 * Berechnet die Koerperschaftsteuer
	 * 
	 * @param einkommen
	 *            der Klasse wird übergeben
	 * @return Die berechnete Körperschaftsteuer
	 */
	public static int berechneKoerperschaftsteuer(int einkommen) {
		int wert = einkommen;
		return wert = ((einkommen / 100) * 25);
	}

	/**
	 * Berechnet die Gewerbesteuer
	 * 
	 * @param einkommen
	 *            der Klasse wird übergeben
	 * @return Die berechnete Gewerbesteuer
	 */
	public static int berechneGewerbesteuer(int einkommen) {
		int wert = einkommen;
		return ((wert / 100) * 10);
	}
}
