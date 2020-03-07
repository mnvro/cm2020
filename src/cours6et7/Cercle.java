package cours6et7;

/**
 * @author Martin
 *
 */
public class Cercle {
	private double rayon;
	public double longueurcercle() {
		return 2*Math.PI*rayon;
	}
	public double aire() {
		return Math.PI*rayon*rayon;
	}
	public Cercle(double rayon) {
		this.rayon=rayon;
	}

	public void affiche() {
		System.out.println(rayon +"cm"+" "+longueurcercle()+"cm"+" "+aire()+"cm2");
	}

	public static void main(String[] args) {
		Cercle c1= new Cercle(1);
		c1.affiche();
		Cercle c2= new Cercle(2);
		c2.affiche();// TODO Auto-generated method stub

	}

}
