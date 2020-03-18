package cours8et9;

/**
 * La class Date cr�e et affiche la date en jour mois et ann�e
 * @author Mourad
 *
 */
public class DateMourad {
	
	private int jour;
	private int mois;
	private int annee;

	public DateMourad() {
	}
	
	public DateMourad (int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	
	public DateMourad (String date) {
		String[] convert = date.split("/");

		String jourString = convert[0];
		String moisString = convert[1];
		String anneeString = convert[2];
		
		this.jour = Integer.parseInt(jourString);
		this.mois= Integer.parseInt(moisString);
		this.annee = Integer.parseInt(anneeString);
	}
	
	public String toString () {
	
		return jour+"/"+mois+"/"+annee;
		
	}
	
	public int getJour() {
		return this.jour;
		
	}
	
	public int getMois () {
		return this.mois;
	}
	
	public int getAnnee() {
		return this.annee;
	}
	
	public void setJour(int jour) {
		this.jour = jour;
	}
	
	public void setMois (int mois) {
		this.mois = mois;
	}
	
	public void setAnnee (int annee) {
		this.annee = annee;
		
	}
	

	


}

