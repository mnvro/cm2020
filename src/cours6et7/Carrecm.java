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
		System.out.println("la surface du carr� est : " + this.surface() +this.mesure+"�");
		System.out.println("Le p�rim�tre du carr� est : " + this.perimetre() +this.mesure);

	}
	public static void main(String[] args){
		Carrecm carrecm1 = new Carrecm(5.0,5.0,"cm");
		Carrecm carrecm2 = new Carrecm(3.0,3.0,"cm");
		carrecm1.afficher();
		carrecm2.afficher();

	}
}
