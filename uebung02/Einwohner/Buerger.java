package Einwohner;

import Steuern.Einkommensteuer;
import Steuern.Steuerrechner;

public class Buerger extends Mensch implements Einkommensteuer{
	public Buerger(String name, long einkommen, int alter){
		super(name, einkommen, alter);
		//Finanzamt.addSteuerpflichtiger(this);
	}
	public void arbeite(){
		//do some work
	}
	@Override
	public long berechneESteuer(){
		return Steuerrechner.einkommensteuer(this);
	}
}
