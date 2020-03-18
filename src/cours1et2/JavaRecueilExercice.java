package cours1et2;

import javax.swing.JOptionPane;

public class JavaRecueilExercice {

	public static void main(String[] args) {
		System.out.println("Hello"+" "+"World!");
		JOptionPane.showMessageDialog(null, "message type 0", "title", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "message type 1", "title", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "message type 2", "title", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "message type 3", "title", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showConfirmDialog(null, "message type 0", "title", JOptionPane.YES_NO_OPTION);
		JOptionPane.showConfirmDialog(null, "message type 1", "title", JOptionPane.YES_NO_CANCEL_OPTION);
		JOptionPane.showConfirmDialog(null, "message type 2", "title", JOptionPane.OK_CANCEL_OPTION);
		String nom = JOptionPane.showInputDialog("Donnez-moi votre nom :");
		System.out.println("Bonjour "+ nom);
		JOptionPane.showMessageDialog(null, "Bonjour "+ nom);
		int nb1, nb2, resultat ; //Exercice 7 & 8
		String nb1s = JOptionPane.showInputDialog("Donnez-moi le premier nombre :");
		String nb2s = JOptionPane.showInputDialog("Donnez-moi le deuxi�me nombre :");
		nb1 = Integer.parseInt(nb1s);
		nb2 = Integer.parseInt(nb2s);
		String resultats = JOptionPane.showInputDialog("Donnez-moi le resultat de :" +nb1 +" + "+ nb2);
		resultat = Integer.parseInt(resultats);
		if (resultat == nb1 + nb2 ) {
			JOptionPane.showMessageDialog(null, "C'est correct !","", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "ERROR","", JOptionPane.ERROR_MESSAGE);
		}
		int nbr1, nbr2, resultatr;//Exercice 9 & 10
		nbr1 = (int)(Math.random()*10);
		nbr2 = (int)(Math.random()*10);
		String resultatsr = JOptionPane.showInputDialog("Donnez-moi le resultat de :" +nbr1 +" + "+ nbr2);
		resultatr = Integer.parseInt(resultatsr);
		if (resultatr == nbr1 + nbr2 ) {
			JOptionPane.showMessageDialog(null, "C'est correct !","", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "ERROR","", JOptionPane.ERROR_MESSAGE);
		}

		int nb1nc, nb2nc, resultatnc, B=0;//Exercice 11 & 12
		String nomnc = JOptionPane.showInputDialog(null, "Donnez-moi votre nom :", "Votre nom", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Bonjour "+ nomnc);
		int NombreDeCalcul = Integer.parseInt(JOptionPane.showInputDialog(null, "Combien de fois voulez-vous calculer ?", "Nombre de calcul à éffectuer", JOptionPane.INFORMATION_MESSAGE));
		for (int i=0; i<NombreDeCalcul; i++) {
			nb1nc = (int)(Math.random()*10);
			nb2nc = (int)(Math.random()*10);
			//String nb1ncs = JOptionPane.showInputDialog(null, "Donnez-moi le premier nombre :", "Le premier nombre", 1);
			//String nb2ncs = JOptionPane.showInputDialog(null, "Donnez-moi le deuxième nombre :", "Le deuxième nombre", 1);
			//nb1nc = Integer.parseInt(nb1ncs);
			//nb2nc = Integer.parseInt(nb2ncs);
			String resultatncs = JOptionPane.showInputDialog(null, "Donnez-moi le resultat de :" +nb1nc +" + "+ nb2nc, "résultat "+(i+1), JOptionPane.INFORMATION_MESSAGE);
			resultatnc = Integer.parseInt(resultatncs);
			if (resultatnc == nb1nc + nb2nc ) {
				JOptionPane.showMessageDialog(null, "C'est correct !","", JOptionPane.INFORMATION_MESSAGE);
				B++;
			}
			else {
				JOptionPane.showMessageDialog(null, "ERROR","", JOptionPane.ERROR_MESSAGE);
			}
		}
		JOptionPane.showMessageDialog(null, nomnc +" Vous avez :"+B +" bonne réponse sur "+ NombreDeCalcul, "Score", JOptionPane.INFORMATION_MESSAGE);
		double score = (double)B/NombreDeCalcul*100;
		if (score == 100) {
			JOptionPane.showMessageDialog(null, "100% Bravo "+ nomnc, "100%", JOptionPane.INFORMATION_MESSAGE);
		} else {
			if (score == 75) {
				JOptionPane.showMessageDialog(null, "75% TB "+ nomnc, "TB", JOptionPane.INFORMATION_MESSAGE);
			} else {
				if (score > 50) {
					JOptionPane.showMessageDialog(null, "Plus de 50% tu as réussi "+ nomnc, "+ 50 %", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Moins de 50%, C'est en se trompant que l'on apprend "+ nomnc, "- 50%", JOptionPane.ERROR_MESSAGE);
				}
			}
		}

		int nb1cc, nb2cc, resultatcc;//Exercice 13
		nb1cc = (int)(Math.random()*10);
		nb2cc = (int)(Math.random()*10);
		do {
			String resultatccs = JOptionPane.showInputDialog("Donnez-moi le resultat de :" +nb1cc +" + "+ nb2cc);
			resultatcc = Integer.parseInt(resultatccs);
		} while (resultatcc != nb1cc+nb2cc);
	}
}


