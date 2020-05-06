package cours14;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Personne {
	private int age;
	private double masse;
	private double taille;

	public Personne() {
	}

	/**
	 * Ce constructeur permet de construire une personne
	 * @param age
	 * @param masse en kg
	 * @param taille en mètre
	 */
	public Personne(int age, double masse, double taille) {
		this.age = age;
		this.masse = masse;
		this.taille = taille;
	}


	/**
	 * Cette méthode permet de calculer l'indic de masse corporelle
	 * @return l'indice de masse corporelle
	 * @throws IMCException si la personne a moins de 18 ans ou plus de 65 ans
	 */
	public double getIMC() throws IMCException{
		if ((age < 18 )||(age > 65))
			throw new IMCException();
		return masse/taille/taille;
	}

	public String toString() {
		String s="";
		try {
			s = "Vous avez "+age+" ans, vous pesez "+masse+" kg, vous mesurez "+
				taille;
			DecimalFormat df = new DecimalFormat("0.0");
			return s+"\nVotre IMC est de "+df.format(getIMC())+"\n"+
				"Vous avez "+IMC.getMessage(getIMC());
		} catch (IMCException e) {
			e.printStackTrace();
			return s+"\nLa formule de cacul de l'IMC n'est pas valide pour votre âge";
		}
	}

	public static void main(String[] args) {
		double masse = Double.parseDouble(JOptionPane.showInputDialog("Quelle est votre masse (en kg) ?"));
		double taille = Double.parseDouble(JOptionPane.showInputDialog("Quelle est votre taille (en mètre) ?"));
		int age = Integer.parseInt(JOptionPane.showInputDialog("Quel est votre âge ?"));
		Personne p = new Personne(age, masse, taille);
		JOptionPane.showMessageDialog(null, p);
		
	}
}
