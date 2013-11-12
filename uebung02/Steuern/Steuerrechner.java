package Steuern;

import Einwohner.Buerger;
import Einwohner.Schurke;
import Syndikat.Syndikat;
import Unternehmen.Kapitalgesellschaft;
import Unternehmen.Personengesellschaft;
import Unternehmen.Unternehmen;

public class Steuerrechner {
	public static long einkommensteuer(Instanz m) {
		long einkommen = 0;
		if (m instanceof Schurke) {
			einkommen = ((Schurke) m).getEinkommen();
		} else if (m instanceof Buerger) {
			einkommen = ((Buerger) m).getEinkommen();
		} else if (m instanceof Unternehmen) {
			einkommen = ((Personengesellschaft) m).getEinkommen();
		}
		return berechneEinkommensteuer(einkommen);

	}

	public static long berechneEinkommensteuer(long einkommen) {

		if (einkommen <= 20000) {

			return einkommen * 10 / 100;

		} else if (einkommen > 20000 && einkommen <= 60000) {

			long temp = einkommen - 20000;
			long temp2 = temp * 25 / 100;
			return temp2 + 2000;

		} else if (einkommen > 60000 && einkommen <= 120000) {

			long temp = einkommen - 60000;
			long temp2 = temp * 35 / 100;
			return temp2 + 12000;

		} else {
			
			long temp = einkommen - 120000;
			long temp2 = temp * 50 / 100;
			return temp2 + 33000;
		}
	}

	public static long gewerbesteuer(Unternehmen u) {
		if (u instanceof Personengesellschaft) {
			long temp =0;
			temp =u.getEinkommen();
			if (temp<=1000){
				return 0;
			}
			else{
				
				return (temp-1000) * 10 / 100;
			}
		} else {
			return (u.getEinkommen() * 10 / 100);
		}
	}

	public static long koerpersteuer(Kapitalgesellschaft u) {

		return u.getEinkommen() * 25 / 100;

	}

	public static long koerpersteuer(Syndikat s) {

		return s.getGewinn() * 25 / 100;
	}

}
