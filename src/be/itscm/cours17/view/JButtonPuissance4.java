package be.itscm.cours17.view;

import javax.swing.JButton;

public class JButtonPuissance4 extends JButton{
	public static final int COULEUR_ROUGE = 1;
	public static final int COULEUR_JAUNE = 2;
	public static final int COULEUR_AUCUNE = 0;
	private int colonne, ligne;
	private int color;

	public JButtonPuissance4(int colonne, int ligne, int color) {
		this.colonne = colonne;
		this.ligne = ligne;
		this.color = color;
	}

	public int getColonne() {
		return colonne;
	}

	public int getLigne() {
		return ligne;
	}
	
	public int getColor() {
		return color;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
}