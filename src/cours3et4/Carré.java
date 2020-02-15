package cours3et4;

/**
 * @author Floris
 *
 */
public class Carré {
	private double longueur;
	public double périmètre() {
		return longueur * 4;
	}
	public double aire() {
		return longueur * longueur;
	}
	
	public void affiche() {
		System.out.println("Longueur du carré : "+ longueur+ " cm"+" Périmètre :"+périmètre()+ 
				" cm"+" Aire : "+aire()+ " cm²");
	}

	public static void main(String[] args) {
		Carré L1 = new Carré();
		L1.longueur = 2.5;
//		L1.périmètre();
//		L1.aire();
		L1.affiche();
		
		Carré L2 = new Carré();
		L2.longueur = 3.5;
//		L2.périmètre();
//		L2.aire();
		L2.affiche();

	}

}
