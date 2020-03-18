package cm2020;

/**
 * @author Floris
 *
 */
public class Etudiant {
 
	private String nom;
	private String prenom;
	private int nombreCalcul;
	private int nombreBonneReponse;
	
	public Etudiant() {
		
	}
	public double moyenne() {
		return (double)nombreBonneReponse / nombreCalcul*100;
	}
	
	public void affiche() {
		System.out.println(nom+" "+prenom+" "+nombreCalcul+" "+nombreBonneReponse+" "+moyenne()+"%");
	}
	public static void main(String[] args) {
		Etudiant Et1 = new Etudiant();
		Et1.nom = "Gasogo";
		Et1.prenom = "Floris";
		Et1.nombreCalcul = 10;
		Et1.nombreBonneReponse = 8;
		Et1.moyenne();
		Et1.affiche();

	}

}
