package cours3et4;

public class HuileEssentielle {
	private String nom;
	private int contenance;
	private double prix;
	private void affiche() {
		System.out.println(nom+" "+contenance+"ml"+" "+prix+"€");
	}
	public static void main(String[] args) {
		HuileEssentielle he1 = new HuileEssentielle();
		he1.nom="Orange sanguin";
		he1.contenance=10;
		he1.prix=2.20;
		he1.affiche();
		HuileEssentielle he2=new HuileEssentielle();
		he2.nom="Eucalyptus radié";
		he2.contenance=10;
		he2.prix=5.90;
		he2.affiche();

	}

}
