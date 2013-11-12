package Einwohner;

import Steuern.Instanz;

public abstract class Einwohner extends Instanz{
	
	private String name;
	private long einkommen;

	public Einwohner(String name, long einkommen){
		this.name = name;
		this.einkommen = einkommen;
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
