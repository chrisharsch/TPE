package Einwohner;

public abstract class Mensch extends Einwohner{
	
	private int alter;
	
	Mensch(String name, long einkommen,int alter){
		super(name,einkommen);
		this.alter=alter;
	}
	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}
}
