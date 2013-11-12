package Einwohner;

public abstract class Mutant extends Einwohner{
	private String mutation;
	
	Mutant(String name, long einkommen, String mutation){
		super(name, einkommen);
		this.mutation = mutation;
	}
	public abstract boolean kaempfe(Mutant m);
	
	public String getMutation() {
		return mutation;
	}
	public void setMutation(String mutation) {
		this.mutation = mutation;
	}
}
