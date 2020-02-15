package cours3et4;


/**
 * @author Bel
 *
 */
public class UnCarré {
	private double longueur;

	public double périmetre () {
		return longueur*4;
	}
	public double aire() {
		return longueur*2;
	}
	public void affiche() {
		System.out.println("le carré de longeur"+" "+longueur+"cm"+" "+"a un périmetre de"+" "+périmetre()+"cm"+" "+"et une aire de"+" "+aire()+"m2");
	}
	public static void main(String[] args) { 
		UnCarré Ca1 = new UnCarré();
		Ca1.longueur = 11.5;
//		Ca1.périmetre();
//		Ca1.aire();
		Ca1.affiche();
		
		UnCarré Ca2 = new UnCarré();
		Ca2.longueur = 13;
//		Ca2.périmetre();
//		Ca2.aire();
		Ca2.affiche();

	}
}

