package cours3et4;

/**
 * @author Floris
 *
 */
public class Carr� {
	private double longueur;
	public double p�rim�tre() {
		return longueur * 4;
	}
	public double aire() {
		return longueur * longueur;
	}
	
	public void affiche() {
		System.out.println("Longueur du carr� : "+ longueur+ " cm"+" P�rim�tre :"+p�rim�tre()+ 
				" cm"+" Aire : "+aire()+ " cm�");
	}

	public static void main(String[] args) {
		Carr� L1 = new Carr�();
		L1.longueur = 2.5;
//		L1.p�rim�tre();
//		L1.aire();
		L1.affiche();
		
		Carr� L2 = new Carr�();
		L2.longueur = 3.5;
//		L2.p�rim�tre();
//		L2.aire();
		L2.affiche();

	}

}
