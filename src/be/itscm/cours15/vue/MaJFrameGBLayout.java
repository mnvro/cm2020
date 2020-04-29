package be.itscm.cours15.vue;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MaJFrameGBLayout extends JFrame {
	private int nbLignes = 3;
	private int nbColonnes = 5;
	private JButton tabJB[][] = new JButton[nbColonnes][nbLignes]; 
	public static void main(String[] args) {
		MaJFrameGBLayout frame = new MaJFrameGBLayout();
	}
	public MaJFrameGBLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		for (int c = 0 ; c < nbColonnes ; c++ ){
			for (int l = 0 ; l < nbLignes ; l++){
				tabJB[c][l] = new JButton(c+","+l);
				gbc.gridx = c;
				gbc.gridy = l;
				getContentPane().add(tabJB[c][l], gbc);
			}
		}
		this.setVisible(true);
	}
}