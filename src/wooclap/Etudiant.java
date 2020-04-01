package wooclap;
class Personne {
	private String nom, prenom;
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public String toString() {
		return "Nom = "+nom+" Pr�nom = "+prenom;
	}
}
public class Etudiant extends Personne {
	private int num;
	public Etudiant(String nom, String prenom, int num) {
		super(nom, prenom);
		this.num=num;
	}
	public String toString() {
		return super.toString()+" Num�ro = "+num;
	}
	public static void main(String[] args) {
		Etudiant et = new Etudiant("Vroman", "M.-N.", 5);
		System.out.println(et);
	}
}




