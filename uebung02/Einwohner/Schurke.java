package Einwohner;

import Steuern.Einkommensteuer;
import Steuern.Steuerrechner;


public class Schurke extends Mutant implements Einkommensteuer{
	private final Superkraft superkraft;
	public Schurke(String name, long einkommen, String mutation, Superkraft superkraft) {
		super(name, einkommen, mutation);
		this.superkraft=superkraft;
		//Finanzamt.addSteuerpflichtiger(this);
	}
	public Superkraft getSuperkraft() {
		return superkraft;
	}
	@Override
	public boolean kaempfe(Mutant m){
		if(m instanceof Superheld){
		if(((Superheld)m).kaempfe(this)==false){
			return true;
		}else{
			return false;
		}}
		else{
			throw new IllegalArgumentException("Schurken kaempfen nicht gegeneinander!");
		}
	}

	@Override
	public long berechneESteuer() {
		return Steuerrechner.einkommensteuer(this);
	}
	
}
