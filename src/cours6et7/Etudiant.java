package cours6et7;

import javax.swing.JOptionPane;

/**
 * @author Floris
 *
 */
public class Etudiant {
 
	private String nom;
	private String prenom;
	private int nombreCalcul = 0;
	private int nombreBonneReponse = 0;
	
	public Etudiant() {
	}
	
	public void propositionNouveauCalcul() {
		int a = (int)(Math.random()*11);
		int b = (int)(Math.random()*11);
		int rep = Integer.parseInt(JOptionPane.showInputDialog(
				"Calcule-moi "+a+" * "+b+" ="));
		nombreCalcul++;
		if (rep == a*b) {
			nombreBonneReponse++;
		} else {
			JOptionPane.showMessageDialog(null, "Mauvaise réponse");
		}
	}
	
	public double moyenne() {
		return (double)nombreBonneReponse / nombreCalcul*100;
	}
	
	public void affiche() {
		System.out.println(nom+" "+prenom+" "+nombreBonneReponse+" / "+
				nombreCalcul+" = "+moyenne()+" %");
	}
	public static void main(String[] args) {
		Etudiant et1 = new Etudiant();
		et1.nom = "Gasogo";
		et1.prenom = "Floris";
		for (int i = 0; i<3 ; i++) {
			et1.propositionNouveauCalcul();
		}
		
		et1.affiche();

	}

}
