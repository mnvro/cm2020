package cours6et7;


/**
 * @author Mamadou
 *
 */
public class CarreEnCm{
	private double cote;
	private String nom;

	public double longueur () {
		return cote * 4;
	}
	public double surface () {
		return cote * cote;
	}
	public void affiche () {
		System.out.println(nom+ " "+longueur()+" m "+surface()+" m²");
	}
	public CarreEnCm (double cote) {
		this.cote=cote;
	}
	public CarreEnCm () {
	}
	
	public static void main(String[] args) {
		CarreEnCm Ca1 = new CarreEnCm(0.5);
		CarreEnCm Ca2= new CarreEnCm ();
		Ca1.nom="Carre";
		Ca2.nom="essai";
		Ca2.cote=6;
		Ca1.affiche();
		Ca2.affiche();
	}

}
