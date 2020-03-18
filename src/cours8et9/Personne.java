package cours8et9;

import javax.swing.JOptionPane;


/**
 * La classe personne permet de créer des personnes dont on précise la taille et la masse
 * Elle contient la méthode getIMC qui permet de connaitre l'indice de masse corporelle de la personne
 * 
 * @author mnv
 */
public class Personne {
	private double taille;
	private double masse;
	public Personne() {
	}
	/**
	 * Le constructeur Personne permet de créer une personne dont on passe en paramètre la taille et la masse
	 * @param taille La taille de la personne en mètre
	 * @param masse La masse de la personne en kg
	 */
	public Personne(double taille, double masse) {
		if (taille < 0) taille = -taille;
		if (masse < 0) masse = -masse;
		this.taille = taille;
		this.masse = masse;
	}
	public double getTaille() {
		return taille;
	}
	/**
	 * La méthode setTaille permet de modifier la taille de la personne
	 * @param taille la taille de la personne en mètres
	 */
	public void setTaille(double taille) {
		if (taille < 0) taille = -taille;
		this.taille = taille;
	}
	public double getMasse() {
		return masse;
	}
	public void setMasse(double masse) {
		if (masse < 0) masse = -masse;
		this.masse = masse;
	}
	/**
	 * La méthode getIMC permet de calculer l'indice de masse corporelle d'une personne
	 * @return la valeur de l'IMC
	 */
	public double getIMC() {
		return masse/taille/taille;
	}
	public String toString() {
		return "Cette personne a une taille de " + taille + " mètres et une masse de " + masse + "kg.\nSon IMC vaut " + getIMC() ;
	}
	public static void main(String[] args) {
		Personne p1 = new Personne(1.80,80);
		System.out.println("Votre IMC est de "+p1.getIMC());
		p1.setTaille(1.56);
		System.out.println("Votre IMC est de "+p1.getIMC());
		Personne p2 = new Personne(1.90,90);
		System.out.println(p2);
	}
}
