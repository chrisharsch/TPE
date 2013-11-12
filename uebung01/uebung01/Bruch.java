package uebung01;

/**
 * 
 * Die Klasse dient zum Berechnen von Brüchen und deren Ausgabe
 * 
 * @author Severin Kohler, Chris Harsch
 */

public class Bruch {
	private long zaehler;
	private long nenner;
	private long ganze = 0;
	
	//-------------Konstruktoren-----------------//
	Bruch(long ganze, long zaehler, long nenner) {
		this.nenner = nenner;
		this.zaehler = zaehler;
		this.ganze = ganze;
		kuerzen();
	}
	
	Bruch(long zaehler, long nenner) {
		this.nenner = nenner;
		this.zaehler = zaehler;
		kuerzen();
	}
	//-------------Methoden-----------------//
	
	/**
	 * Methode um 2 Brüche zu Addieren
	 * @param b ist der 2te Bruch der addiert werden soll
	 * @return	Ergebnis der Addition als Bruch zurück
	 */
	
	public Bruch addiere(Bruch b) {
		unechterBruch();
		b.unechterBruch();
		long temp2 = this.nenner;
		erweitern(b.getNennner());
		b.erweitern(temp2);
		long temp = 0;
		temp = this.zaehler + b.getZaehler();
		Bruch c = new Bruch(temp, this.nenner);
		return c;
	}
	
	/**
	 * 
	 * @param b	ist der 2te Bruch der substrahiert werden soll
	 * @return Ergebnis der Subtraktion als Bruch
	 */
	
	public Bruch substrahiere(Bruch b) {
		unechterBruch();
		b.unechterBruch();
		long temp2 = this.nenner;
		erweitern(b.getNennner());
		b.erweitern(temp2);
		long temp = this.zaehler - b.getZaehler();
		Bruch c = new Bruch(temp, this.nenner);
		return c;

	}
	
	/**
	 * Erweitert den vorhandenen Bruch
	 * @param a ist der Wert um den der Bruch erweitert werden soll
	 */
	
	public void erweitern(long a) {
		this.zaehler = this.zaehler * a;
		this.nenner = this.nenner * a;
	}
	
	/**
	 * Kuerzt den vorhandenen Bruch
	 */
	
	public void kuerzen() {
		for (int j = 0; j < this.nenner; j++) {
			for (int i = 2; i < this.nenner; i++) {
				if (this.nenner % i == 0 && this.zaehler % i == 0) {
					this.nenner = this.nenner / i;
					this.zaehler = this.zaehler / i;
				}
			}
		}
	}
	
	/**
	 * Multipliziert einen Bruch mit einem weiteren
	 * @param b ist der Bruch der mit dem vorhandenen Multipliziert wird
	 * @return Ergebnis der Multiplikation als Bruch
	 */

	public Bruch multipliziere(Bruch b) {
		long temp1;
		long temp2;
		unechterBruch();
		b.unechterBruch();
		temp1 = this.zaehler * b.getZaehler();
		temp2 = this.nenner * b.getNennner();
		Bruch c = new Bruch(temp1, temp2);
		return c;
	}

	/**
	 * Multipliziert den Bruch mit einer ganzen Zahl
	 * @param a ist die Ganzzahl mit der der Bruch multipliziert wird
	 * @return Ergebnis der Multiplikation als Bruch
	 */
	
	public Bruch multipliziere(long a) {
		long temp;
		unechterBruch();
		temp = this.zaehler * a;
		Bruch c = new Bruch(temp, this.nenner);
		return c;
	}

	/**
	 * Dividiert den Bruch durch einen zweiten Bruch
	 * @param b ist der Bruch durch den der 2te dividiert wird
	 * @return Ergebnis der Division als Bruch
	 */
	
	public Bruch dividiere(Bruch b) {
		long temp1;
		long temp2;
		unechterBruch();
		b.unechterBruch();
		temp1 = this.zaehler * b.getNennner();
		temp2 = this.nenner * b.getZaehler();
		Bruch c = new Bruch(temp1, temp2);
		return c;
	}

	/**
	 * Dividiert den Bruch durch eine ganze Zahl
	 * @param a ist die Ganzzahl mit der der Bruch dividiert werden soll
	 * @return Ergebnis der Division als Bruch
	 */
	
	public Bruch dividiere(long a) {
		long temp;
		unechterBruch();
		temp = this.nenner * a;
		Bruch c = new Bruch(this.zaehler, temp);
		return c;
	}

	/**
	 * Potenziert einen Bruch mit einer Ganzzahl
	 * @param a ist der Wert um den der Bruch potenziert wird
	 * @return Potenzierter Bruch
	 */
	
	public Bruch potenziere(long a) {
		if(a==0){
			return new Bruch(1,0,0);
		}else if (a==1){
			return new Bruch(this.zaehler,this.nenner);
		}
		long temp1 = this.zaehler;
		long temp2 = this.nenner;
		long temp3 = this.zaehler;
		long temp4 = this.nenner;
		for (long i = 1; i < a; i++) {
			temp3 *=  temp1;
			temp4 *=  temp2;
		}
		return new Bruch(temp3,temp4);
	}

	/**
	 * Wandelt den Bruch in einen echten Bruch um
	 * @return echter Bruch
	 */
	
	public Bruch echterBruch() {
		long temp1=this.zaehler;
		long temp2=0;
		if (isEcht() == false) {
			temp1 = this.zaehler / this.nenner;
			temp2 = this.zaehler % this.nenner;	
		}
		if(temp2==0){
			return new Bruch(temp1,this.nenner);
		}
		return new Bruch(temp1,temp2,this.nenner);
	}

	/**
	 * Wandelt den Bruch in einen unechten Bruch um
	 * @return unechter Bruch
	 */
	
	public Bruch unechterBruch() {
		long temp1=this.zaehler;
		if (ganze != 0) {
			temp1 = this.ganze * this.nenner + this.zaehler;
			this.ganze = 0;
		}
		return new Bruch(temp1, this.nenner);
	}

	/**
	 * Überprüft ob der Bruch echt ist oder nicht
	 * @return Gibt true zurück wen der Bruch echt ist ansonsten gibt er fals zurück
	 */
	
	public boolean isEcht() {
		if (zaehler > nenner) {
			return false;
		}
		return true;
	}
	
	/**
	 * Wandelt den Bruch in eine Dezimalzahl um
	 * @return Dezimalzahl als double
	 */
	
	public double getDezimalzahl() {
		unechterBruch();
		double zaehler =this.zaehler;
		double nenner = this.nenner;
		return zaehler / nenner;
	}
	
	/**
	 * Bildet den Kehrwert der vorhandenen Bruchs
	 * @return Kehrwert des Bruchs
	 */
	
	public Bruch kehrwert() {
		unechterBruch();
		return new Bruch(this.nenner,this.zaehler);
	}
	
	/**
	 * Gibt die Ganzzahl des Bruchs als long zurück
	 * @return Ganzzahl des Bruchs
	 */
	
	public long getGanze() {
		return this.ganze;
	}
	
	/**
	 * Gibt den Zähler der Bruchs als long zurück
	 * @return Zähler der Bruchs
	 */
	
	public long getZaehler() {
		return this.zaehler;
	}
	
	/**
	 * Gibt den Nenner des Bruchs als long zurück
	 * @return Nenner des Bruchs
	 */
	
	public long getNennner() {
		return this.nenner;
	}

	/**
	 * Umformung des Bruch in einen String
	 * @return Bruch in String umgewandelt
	 */
	
	public String toString() {
		if(this.zaehler % this.nenner==0 && this.ganze==0){
			this.ganze=this.zaehler/this.nenner;
			return this.ganze+"";
		}else if (ganze==0) {
			return this.zaehler + "/" + this.nenner;
		}
		return this.ganze + " " + this.zaehler + "/" + this.nenner;
	}
	
	/**
	 * Überprüft ob der Bruch gleichheit zu einem anderen aufweist
	 * @return Gibt true bei Übereinstimmung zurück ansonsten false
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bruch other = (Bruch) obj;
		if (ganze != other.ganze)
			return false;
		if (nenner != other.nenner)
			return false;
		if (zaehler != other.zaehler)
			return false;
		return true;
	}

}
