package cours3et4;

/**
 * @author Yassin
 *
 */
public class Cercle {

	private double longRayon;
	private String unité;


	public void affiche () {
		System.out.println("Le périmètre vaut : " +
	périmètre()+" "+unité+	"\nL'aire vaut:" + aire() + " "	+ unité+ "²");
	}	
	public double aire (){
		return Math.PI*longRayon*longRayon;
	}
	public double périmètre () {
		return 2*Math.PI*longRayon;
	}
	public static void main(String[] args) {


		Cercle cercle1 = new Cercle ();
		cercle1.longRayon = 0.5;
		cercle1.unité = "cm";
		cercle1.affiche ();
		
		Cercle cercle2 = new Cercle ();
		cercle2.longRayon = 10;
		cercle2.unité = "m";
		cercle2.affiche ();
	}


}
