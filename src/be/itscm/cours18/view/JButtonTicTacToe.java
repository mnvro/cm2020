package be.itscm.cours18.view;

import javax.swing.JButton;

public class JButtonTicTacToe extends JButton {
	private int colonne,ligne;
	private boolean cliquable = true;

	public JButtonTicTacToe(int colonne, int ligne) {
		super();
		this.colonne = colonne;
		this.ligne = ligne;
	}

	public int getColonne() {
		return colonne;
	}

	

	public boolean estCliquable() {
		return cliquable;
	}

	public void setCliquable(boolean cliquable) {
		this.cliquable = cliquable;
	}

	public int getLigne() {
		return ligne;
	}
	
}
