package cours3et4;


/**
 * @author Bel
 *
 */
public class UnCarr� {
	private double longueur;

	public double p�rimetre () {
		return longueur*4;
	}
	public double aire() {
		return longueur*2;
	}
	public void affiche() {
		System.out.println("le carr� de longeur"+" "+longueur+"cm"+" "+"a un p�rimetre de"+" "+p�rimetre()+"cm"+" "+"et une aire de"+" "+aire()+"m2");
	}
	public static void main(String[] args) { 
		UnCarr� Ca1 = new UnCarr�();
		Ca1.longueur = 11.5;
//		Ca1.p�rimetre();
//		Ca1.aire();
		Ca1.affiche();
		
		UnCarr� Ca2 = new UnCarr�();
		Ca2.longueur = 13;
//		Ca2.p�rimetre();
//		Ca2.aire();
		Ca2.affiche();

	}
}

