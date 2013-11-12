package Unternehmen;

import java.util.LinkedList;

import Einwohner.Buerger;
import Steuern.Koerperschaftssteuer;
import Steuern.Steuerrechner;

public class Kapitalgesellschaft extends Unternehmen implements Koerperschaftssteuer {
	private LinkedList<Buerger> gesellschafter = new LinkedList();

	public Kapitalgesellschaft(String name, long einkommen) {
		super(name, einkommen);
	}

	public void addGesellschafter(Buerger b) {
		gesellschafter.add(b);
	}

	public void removeGesellschafter(Buerger b) {
		if (gesellschafter.contains(b)) {

			gesellschafter.remove(b);
		} else {
			throw new IllegalArgumentException("Dieser Buerger ist kein Gesellschafter dieser Kapitalgesellschat!");
		}

	}

	@Override
	public long berechneKSteuer() {
		return Steuerrechner.koerpersteuer(this);
	}

	@Override
	public long berechneGSteuer() {
		return Steuerrechner.gewerbesteuer(this);
	}
}