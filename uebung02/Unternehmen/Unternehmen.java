package Unternehmen;

import Steuern.Instanz;

public abstract class Unternehmen extends Instanz implements Gewerbesteuer{
	private String name;
	private long einkommen;
	Unternehmen(String name){
		this.name=name;
	}
	Unternehmen(String name, long einkommen){
		this.name=name;
		this.einkommen=einkommen;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getEinkommen() {
		return einkommen;
	}
	public void setEinkommen(long einkommen) {
		this.einkommen = einkommen;
	}

}
