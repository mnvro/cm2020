package cours8et9;

import javax.swing.JOptionPane;


/**
 * La classe personne permet de cr�er des personnes dont on pr�cise la taille et la masse
 * Elle contient la m�thode getIMC qui permet de connaitre l'indice de masse corporelle de la personne
 * 
 * @author mnv
 */
public class Personne {
	private double taille;
	private double masse;
	public Personne() {
	}
	/**
	 * Le constructeur Personne permet de cr�er une personne dont on passe en param�tre la taille et la masse
	 * @param taille La taille de la personne en m�tre
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
	 * La m�thode setTaille permet de modifier la taille de la personne
	 * @param taille la taille de la personne en m�tres
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
	 * La m�thode getIMC permet de calculer l'indice de masse corporelle d'une personne
	 * @return la valeur de l'IMC
	 */
	public double getIMC() {
		return masse/taille/taille;
	}
	public String toString() {
		return "Cette personne a une taille de " + taille + " m�tres et une masse de " + masse + "kg.\nSon IMC vaut " + getIMC() ;
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
