package Etudiant;


/**
 * @author Oussama
 *
 */
public class Date {
	private int jour;
	private int mois;
	private int annee;

	public Date (){}


	public Date (int jour, int mois, int annee){
		this.jour = jour;
		this.mois = mois;
		this.annee = annee; 
	}

	public Date (String date){
		String[]num = date.split("/");
		this.jour = Integer.parseInt(num[0]);
		this.mois = Integer.parseInt(num[1]);
		this.annee = Integer.parseInt(num [2]);
	}

	public void setJour (int jour){
		this.jour = jour;
	}
	public int getJour (){
		return jour;
	}
	public void setMois(int mois){
		this.mois = mois;
	}
	public int mois() {
		return mois;
	}
	public void setAnnee (int annee){
		this.annee = annee;
	}
	public int getAnnee (){
		return annee;
	}

	
	public String toString() {
		return jour+"/"+mois+"/"+annee;
	}

	public static void main (String[] args) {
		Date date1 = new Date();
		date1.setJour(7);
		date1.setMois(12);
		date1.setAnnee(1989);
		System.out.println(date1);

		Date date2 = new Date(11,5,1929);
		System.out.println(date2);
		Date date3 = new Date("23/08/1991");
		System.out.println(date3);
	}
}
