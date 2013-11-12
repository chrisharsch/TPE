package Einwohner;
import java.util.LinkedList;


public class Superheld extends Mutant{
	private LinkedList<Superkraft> Superkraefte =new LinkedList();
	
	public Superheld(String name, long einkommen, String mutation, Superkraft superkraft) {
		super(name, einkommen, mutation);
		Superkraefte.add(superkraft);
	}
	public LinkedList<Superkraft> getSuperkraefte() {
		return Superkraefte;
	}
	public void addSuperkraefte(Superkraft superkraft) {
		Superkraefte.add(superkraft);
	}
	public boolean kaempfe(Mutant m){
		if(m instanceof Schurke){
			if(Superkraefte.contains(((Schurke) m).getSuperkraft())){
				return true;
			}else{
				return false;
			}
		}else{
			throw new IllegalArgumentException("Superhelden kaempfen nicht gegeneinander!");
		}
	}
	
	

}
