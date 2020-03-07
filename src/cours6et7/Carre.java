package cours6et7;


/**
 * @author Anas
 *
 */
public class Carre {
	private double longueur ;

		public double perimetre () {
			return longueur*4 ;
		}
		public double aire () {
			return longueur*longueur;
		}
		public void affiche() {
			System.out.println("le carre de longueur"+" "+longueur+"cm"+" "+"a un perimetre de"+" "+perimetre ()+" cm"+" "+"et une aire de"+" " +aire()+" cm² ");
			
		}
		
		public Carre(double longueur) {
			this.longueur = longueur;
		}
		
		public Carre() {
		}
		
		public static void main(String[] args) {
		Carre carre1 = new Carre();
		carre1.longueur =11.5;
		carre1.perimetre();
		carre1.aire();
		carre1.affiche();
		
		Carre carre2 =new Carre();
		carre2.longueur =13;
		carre2.perimetre();
		carre2.aire();
		carre2.affiche();

	}

}
