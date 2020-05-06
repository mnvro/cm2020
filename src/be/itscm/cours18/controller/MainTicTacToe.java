package be.itscm.cours18.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import be.itscm.cours18.model.TicTacToeModel;
import be.itscm.cours18.view.JButtonTicTacToe;
import be.itscm.cours18.view.JFrameTicTacToe;

public class MainTicTacToe implements ActionListener {
	private JFrameTicTacToe jFrameTicTacToe;
	private TicTacToeModel modele;
	//	private int tour = 0;
	public MainTicTacToe() {
		jFrameTicTacToe = new JFrameTicTacToe();
		jFrameTicTacToe.setVisible(true);
		jFrameTicTacToe.ajouteActionPerformed(this);
		modele = new TicTacToeModel();
	}

	public void actionPerformed(ActionEvent e) {
		JButtonTicTacToe monJButton = (JButtonTicTacToe)e.getSource();
		if (monJButton.estCliquable()) {
			monJButton.setCliquable(false);
			int colonne = monJButton.getColonne();
			int ligne = monJButton.getLigne();
			if (modele.getTurn() == 0) {
				JFrameTicTacToe.changeImageJButton(monJButton,JFrameTicTacToe.IMAGE_O);
			}else {
				JFrameTicTacToe.changeImageJButton(monJButton,JFrameTicTacToe.IMAGE_X);
			}
			modele.play(colonne, ligne);
			int gagnant = modele.win();
//			System.out.println("gagnant ="+gagnant);
			if (gagnant >=0) {
				JOptionPane.showMessageDialog(null,"And the winner is "+modele.ARRAY_CHAR[gagnant]);
				jFrameTicTacToe.reinit();
				modele = new TicTacToeModel();
			} else {
				if (gagnant == -2) {
					JOptionPane.showMessageDialog(null,"Draw!");
					jFrameTicTacToe.reinit();
					modele = new TicTacToeModel();
				}
			}
			
		}
	}
	public static void main(String[] args) {
		new MainTicTacToe();
	}
}
