package cours8et9;

/**
 * @author Floris
 *
 */
public class Datee {
	private int jour;
	private int mois;
	private int annee;
    public Datee() { 	
    }
    public Datee(int jour, int mois, int annee) {
    	this.jour = jour;
    	this.mois = mois;
    	this.annee = annee;
    }
    public int getJour() {
    	return jour;
    }
    public void setJour(int jour){
    	this.jour = jour;
    }
    public int getMois() {
    	return mois;
    }
    public void setMois(int mois) {
    	this.mois = mois;
    }
    public int getAnnee() {
    	return annee;
    }
    public void setAnnee(int annee) {
    	this.annee = annee;
    }
 
	public String toString() {
		return jour + " / " +mois+ " / " + annee;
	}
	public static void main(String[] args) {
		Datee dt1 = new Datee(30,12,1969);
		System.out.println("La date est "+dt1);
		Datee dt2 = new Datee(31,12,1969);
		System.out.println("La date est "+dt2);
		Datee dt3 = new Datee(01,01,1970);
		System.out.println("La date est "+dt3);
		Datee dt4 = new Datee(02,01,1970);
		System.out.println("La date est "+dt4);
		
	}
}
