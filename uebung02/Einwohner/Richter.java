package Einwohner;

public class Richter extends Mensch{
	private boolean korrupt;
	
	public Richter(String name, long einkommen, int alter, boolean korrupt){
		super(name, einkommen, alter);
		this.korrupt=korrupt;
		
	}
	public boolean veruteilen(Schurke s){
		if(this.korrupt==true){
			return false;
		}
		return true;
		
	}

}
