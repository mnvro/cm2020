
package cours8et9;

/**
 * La class Date crée et affiche la date en jour mois et année
 * @author Mourad
 *
 */
public class DateMourad {
	
	private int jour;
	private int mois;
	private int annee;

	/**
	 * Constructeur sans argument
	 */
	public DateMourad() {
	}
	
	/**
	 * Constructeur...
	 * @param jour Un entier compris entre 1 et 31 qui correspond au jour
	 * @param mois Un entier 
	 * @param annee Un entier sur 4 chiffres 
	 */
	public DateMourad (int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	
	/**
	 * Constructeur...
	 * @param date La date sous forme d'une chaine de caractères, par exemple "30/12/1969"
	 */
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
	
	/**
	 * 
	 * @return Un entier ...
	 */
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

