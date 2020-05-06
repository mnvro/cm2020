package cours14;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class IMC {
	public static final String MESSAGES[] = {
			"une dénutrition ou anorexie",
			"une maigreur",
			"un poids normal",
			"un surpoids",
			"une obésité modérée",
			"une obésité sévère",
			"une obésité massive"
	};
	
	public static String getMessage(double imc) {
		if (imc < 16.5) return MESSAGES[0];
		if (imc < 18.5) return MESSAGES[1];
		if (imc <= 25) return MESSAGES[2];
		if (imc < 30) return MESSAGES[3];
		if (imc < 35) return MESSAGES[4];
		if (imc < 40) return MESSAGES[5];
		return MESSAGES[6];
	}
	
	public static void main(String[] args) {
		ArrayList<Personne> personnes = new ArrayList<Personne>();
		personnes.add(new Personne(55,55,1.500));
		personnes.add(new Personne(65,65,1.65));
		personnes.add(new Personne(75,65,1.65));
		for (Personne personne : personnes) {
			JOptionPane.showMessageDialog(null, personne, "Calculette IMC",0);
		}
	}
}
