package cours3et4;

/**
 * @author Yassin
 *
 */
public class Cercle {

	private double longRayon;
	private String unit�;


	public void affiche () {
		System.out.println("Le p�rim�tre vaut : " +
	p�rim�tre()+" "+unit�+	"\nL'aire vaut:" + aire() + " "	+ unit�+ "�");
	}	
	public double aire (){
		return Math.PI*longRayon*longRayon;
	}
	public double p�rim�tre () {
		return 2*Math.PI*longRayon;
	}
	public static void main(String[] args) {


		Cercle cercle1 = new Cercle ();
		cercle1.longRayon = 0.5;
		cercle1.unit� = "cm";
		cercle1.affiche ();
		
		Cercle cercle2 = new Cercle ();
		cercle2.longRayon = 10;
		cercle2.unit� = "m";
		cercle2.affiche ();
	}


}
