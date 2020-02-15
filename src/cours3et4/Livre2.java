package cours3et4;


/**
 * @author Floris
 *
 */
public class Livre2 {
	private String auteur;
	private String titre;
	private int pages;
	
	public void affiche() {
		System.out.println( auteur+" "+ titre+" "+pages);
	}
	

	public static void main(String[] args) {
		Livre2 lv1 = new Livre2();
		lv1.auteur = "Yuval Noah";
		lv1.titre ="Sapiens";
		lv1.pages = 512;
		lv1.affiche();
		
		Livre2 lv2 = new Livre2();
		lv2.auteur = "Thierry Coppée";
		lv2.titre ="Blagues de Toto, tome 1";
		lv2.pages = 32;
		lv2.affiche();

	}

}
