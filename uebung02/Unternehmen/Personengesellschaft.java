package Unternehmen;

import java.util.LinkedList;

import Einwohner.Buerger;
import Steuern.Einkommensteuer;
import Steuern.Steuerrechner;

public class Personengesellschaft extends Unternehmen implements Einkommensteuer{
	private LinkedList<Buerger> inhaber = new LinkedList();

	public Personengesellschaft(String name, long gewinn) {
		super(name, gewinn);
	}

	public void addInhaber(Buerger b) {
		inhaber.add(b);
	}

	public void removeInhaber(Buerger b) {
		if (inhaber.contains(b)) {

			inhaber.remove(b);
		}else{
			throw new IllegalArgumentException("Dieser Buerger ist kein Inhaber dieser Personengesellschaft!");
		}
	}
	@Override
	public long berechneESteuer(){
		return Steuerrechner.gewerbesteuer(this);
	}

	@Override
	public long berechneGSteuer() {
		
		return Steuerrechner.gewerbesteuer(this);
	}
	
}
