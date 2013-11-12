package Syndikat;

import java.util.LinkedList;

import Einwohner.Schurke;
import Steuern.Instanz;
import Steuern.Koerperschaftssteuer;
import Steuern.Steuerrechner;

public class Syndikat extends Instanz implements Koerperschaftssteuer{
	private LinkedList<Schurke> schurken;
	private String name;
	private long gewinn;

	public Syndikat(String name, LinkedList<Schurke> schurken) {
		if (schurken.size()<2){
			throw new IllegalArgumentException("Zu wenige Schurken fŸr ein Syndikat!!!");
		}
		this.name = name;
		this.schurken = schurken;
		berechneGewinn();
	}

	public String getName() {
		return name;
	}

	public long getGewinn() {
		return gewinn;
	}

	private void setGewinn(long gewinn) {
		this.gewinn = gewinn;
	}

	public void removeSchurke(Schurke k) {
		schurken.remove(k);
	}

	private long berechneGewinn() {
		long summe = 0;
		for (Schurke s : schurken) {
			summe += s.getEinkommen();
		}
		setGewinn(summe);
		return summe;
	}

	@Override
	public long berechneKSteuer() {
		
		return Steuerrechner.koerpersteuer(this);
	}

}
