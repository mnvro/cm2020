package cours3et4;

/**
 * @author Oussama
 *
 */
public class Livre {

	private String auteur;
	private String titre;
	private int page;
	
	public void affiche() {
		System.out.println(titre + " de "+auteur+" qui fait "+page + "pages");
	}
	public static void main (String[] args) {
		Livre et1 = new Livre();
		et1.auteur = "yuval Noah Harari";
		et1.titre = "Sapiens: Une br�ve histoire de l'humanit�";
		et1.page = 512;
		et1.affiche();
		
		Livre et2 = new Livre();
		et2.auteur = "Thierry Cop�e";
		et2.titre = "les blagues de Toto, tome 1 : L'�cole des vannes";
		et2.page = 32;
		et2.affiche();
	}
}
