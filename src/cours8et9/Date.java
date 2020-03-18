package cours8et9;

/**
 * @author Dukadjin
 * Classe permettant d'afficher une date
 */
public class Date {
	
	private int jour;
	private int mois;
	private int annee;
	
	public Date() {}
	
	public Date(int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	
	/**
	 * Le constructeur...
	 * @param date la date sous le format d'une chaine de caractères. Par exemple "30/12/1969"
	 */
	public Date(String date) {
		String[]array = date.split("/");
		this.jour = Integer.parseInt(array[0]);
		this.mois = Integer.parseInt(array[1]);
		this.annee = Integer.parseInt(array[2]);
	}
	
	public String toString() {
		return jour + "/" + mois + "/" + annee;
	}
	
	/**
	 * @return
	 */
	public int getJour() {
		return jour;
	}

	/**
	 * @param jour
	 */
	public void setJour(int jour) {
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

	public static void main(String[] args) {
		Date date1 = new Date();
		date1.setAnnee(1970);
		date1.setJour(30);
		date1.setMois(5);
		Date date2 = new Date(25,05,1994);
		Date date3 = new Date("16/08/1478");
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);

	}

}
