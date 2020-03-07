package cours6et7;

/**
 * @author Mourad
 *
 */
public class Carrecm {
	private double longueur;
	private double largeur;
	private String mesure;

	public Carrecm (double longueur, double largeur, String mesure){
		this.longueur = longueur;
		this.largeur = largeur;
		this.mesure = mesure;
	}

	public double surface(){
		return this.longueur*this.largeur;
	}

	public double perimetre (){
		return 4*(this.longueur);
	}

	public void afficher ( ) {	
		System.out.println("la surface du carré est : " + this.surface() +this.mesure+"²");
		System.out.println("Le périmétre du carré est : " + this.perimetre() +this.mesure);

	}
	public static void main(String[] args){
		Carrecm carrecm1 = new Carrecm(5.0,5.0,"cm");
		Carrecm carrecm2 = new Carrecm(3.0,3.0,"cm");
		carrecm1.afficher();
		carrecm2.afficher();

	}
}
