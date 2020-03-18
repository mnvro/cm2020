package cours1et2;

import javax.swing.JOptionPane;

public class Exercice4 {
	public static void main(String[] args) {
		int nbCalculs = 0;
		int reponse = 0;
		int nbBonnesReponses = 0;
		
		nbCalculs = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Combien de calculs voulez-vous faire?", 
						"Exercice calcul mental", 1));
		for (int i=0;i<nbCalculs;i++) {
			int nb1 = (int)(Math.random()*10);
			int nb2 = (int)(Math.random()*10);
			reponse = Integer.parseInt(
					JOptionPane.showInputDialog(null, nb1+"+"+nb2, 
							"Exercice numéro "+(i+1), 1));
			if (reponse == nb1+nb2) {
				nbBonnesReponses++;
				JOptionPane.showMessageDialog(null, "Bonne réponse", "Bravo", 1);
			}else {
				JOptionPane.showMessageDialog(null, "Mauvaise réponse", "Dommage", 0);
			}
		}
		JOptionPane.showMessageDialog(null, "Voici ton score : "+
				nbBonnesReponses+"/"+nbCalculs,"Résultat",1);
	}
}
