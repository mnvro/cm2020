package premier_cours;

/**
 * @author François
 *
 */
public class Date {

	private int jour, mois, annee;

	public Date() {
	}

	public Date(int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

	public Date(String date) {
		String[] P1 = date.split("/");
		this.jour = Integer.parseInt(P1[0]);
		this.jour = Integer.parseInt(P1[1]);
		this.jour = Integer.parseInt(P1[2]);
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public String toString() {
		return "[" + jour + "/" + mois + "/" + annee + "]";
	}

	public static void main(String[] args) {
		Date D1 = new Date("01/01/2000");
		Date D2 = new Date("01/02/2001");
		Date D3 = new Date("01/03/2003");
		System.out.println("la date est :" + D1);
		System.out.println("la date est :" + D2);
		System.out.println("la date est :" + D3);
	}
}
