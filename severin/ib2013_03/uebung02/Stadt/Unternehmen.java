package ib2013_03.uebung02.Stadt;

import ib2013_03.uebung02.Steuern.Steuerpflichtig;

import java.util.LinkedList;

/**
 * Unternehmen erbt von Instanz
 * 
 * @author Severin Kohler, Chris Harsch
 * 
 */
public abstract class Unternehmen extends Instanz {

	private int gewinn;

	/**
	 * Konstruktor von Unternehmen
	 * 
	 * @param gewinn
	 * @param name
	 */
	public Unternehmen(int gewinn, String name) {
		super(name);
		this.gewinn = gewinn;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gibt das Einkommen zurück
	 * 
	 * @return gewinn
	 */
	public int getGewinn() {
		return gewinn;
	}

}
