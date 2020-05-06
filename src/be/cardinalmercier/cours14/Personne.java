package be.cardinalmercier.cours14;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Personne {
	
	private double masse;
	private double taille;
	private int age;
	
	/**
	 * Ce constructeur permet de construire une personne
	 * @param masse la masse de la personne en kg
	 * @param taille la taille de la personne en mètre
	 * @param age l'âge de la personne
	 */
	public Personne(double masse, double taille, int age) {
		this.masse = masse;
		this.taille = taille;
		this.age = age;
	}

	
	/**
	 * La méthode getIMC permet de calculer l'indice de masse corporelle d'une personne
	 * @return l'IMC de la personne
	 * @throws AgeException si la personne a moins de 18 ans ou plus de 65 ans
	 */
	public double getIMC() throws AgeException {
		if (age>=18 && age<=65)
		  return masse/taille/taille;
		throw new AgeException("Trop jeune ou trop vieux");
	}
	
	public String toString() {
		String s = "";
		double imc;
		try {
			s = "Vous pesez "+masse+" kg, vous mesurez "+taille+" m";
			s += ".\nVous avez "+age+ " ans.";
			imc = this.getIMC();
			s += "\nEt votre IMC est de "+imc;
			s += ". Vous avez "+IMC.getMessage(imc)+".";
			return s;
		} catch (AgeException e) {	
			e.printStackTrace();
			s += "\nMalheureusement la formule n'est pas valide pour votre âge";
			return s;
		}
		
	}

	public static void main(String[] args) {
		ArrayList<Personne> listePersonnes = new ArrayList<Personne>();
		double taille = Double.parseDouble(JOptionPane.showInputDialog("Quel est votre taille ?"));
		double masse = Double.parseDouble(JOptionPane.showInputDialog("Quel est votre poids ?"));
		int age = Integer.parseInt(JOptionPane.showInputDialog("Quel est votre âge ?"));
		listePersonnes.add(new Personne(masse, taille, age));
		taille = Double.parseDouble(JOptionPane.showInputDialog("Quel est votre taille ?"));
		masse = Double.parseDouble(JOptionPane.showInputDialog("Quel est votre poids ?"));
		age = Integer.parseInt(JOptionPane.showInputDialog("Quel est votre âge ?"));
		listePersonnes.add(new Personne(masse, taille, age));
		for (Personne personne : listePersonnes) {
			JOptionPane.showMessageDialog(null, personne);
		}
	}

}
