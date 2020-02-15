package cours3et4;

/**
 * @author Martin
 *
 */
public class Date {
	private int jour;
	private int mois;
	private int année;
	public void affiche() {
		System.out.println(jour+" "+mois+" "+année);
	}
	public static void main(String[] args) {
		Date dat1 = new Date();
		dat1.jour = 15;
		dat1.mois= 02 ;
		dat1.année=2020;
		dat1.affiche();
		Date dat2= new Date();
		dat2.jour = 16;
		dat2.mois= 02;
		dat2.année=1970;
		dat2.affiche();

	}

}
