package cours3et4;


/**
 * @author Mamadou
 *
 */
public class HuileEssentielle2 {
	private String nom;
	private int contenance;
	private double prix;

	public void affiche() {
		System.out.println(nom+" "+contenance+"ml"+prix+"€");
	}
	public static void main(String[] args) {
		HuileEssentielle2 hu1 = new HuileEssentielle2();
		hu1.nom = "orange sanguine";
		hu1.contenance = 10;
		hu1.prix= 2.50;
		hu1.affiche();

		HuileEssentielle2 hu2 = new HuileEssentielle2();
		hu2.nom="eucalyptus radié";
		hu2.contenance=30;
		hu2.prix=5.90;
		hu2.affiche();

	}

}
