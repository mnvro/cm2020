package be.itscm.cours18.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;

public class JFrameTicTacToe extends JFrame  {
	public static final int NBCOLONNES = 3;
	public static final int NBLIGNES = 3;
	public static final String IMAGE_O = "/be/itscm/cours18/images/tic case o.png";
	public static final String IMAGE_X = "/be/itscm/cours18/images/tic case x.png";
	public static final String IMAGE_VIDE = "/be/itscm/cours18/images/tic case vide.png";
	
	private JPanel contentPane;
	private JButtonTicTacToe plateau[][] = new JButtonTicTacToe[NBCOLONNES][NBLIGNES];

	

	/**
	 * Create the frame.
	 */
	public JFrameTicTacToe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 155, 189);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(1,1,1,1));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		for (int colonne = 0 ; colonne < NBCOLONNES ; colonne++) {
			for (int ligne = 0 ; ligne < NBLIGNES ; ligne++) {
				plateau[colonne][ligne] = new JButtonTicTacToe(ligne,colonne);
				plateau[colonne][ligne].setIcon(new ImageIcon(
						JFrameTicTacToe.class.getResource(IMAGE_VIDE)));
				plateau[colonne][ligne].setBorder(new EmptyBorder(0, 0, 0, 0));
				GridBagConstraints gbc = new GridBagConstraints();
				gbc.gridx = colonne;
				gbc.gridy = ligne;
				contentPane.add(plateau[colonne][ligne], gbc);
			}
		}

	}
	
	public void reinit() {
		for (int colonne = 0 ; colonne < NBCOLONNES ; colonne++) {
			for (int ligne = 0 ; ligne < NBLIGNES ; ligne++) {
				
				plateau[colonne][ligne].setIcon(new ImageIcon(
						JFrameTicTacToe.class.getResource(IMAGE_VIDE)));
				plateau[colonne][ligne].setCliquable(true);
			}
		}
	}

	/**
	 * Cette méthode permet de modifier l'image sur le jButton dont on précise la ligne et la colonne
	 * @param colonne la colonne où se trouve le JButton (0 = tout à gauche)
	 * @param ligne la ligne où se trouve le JButton (0 = tout en haut)
	 * @param s le nom du fichier image (son chemin et son nom) - on peut utiliser une des 3 constantes de classes: IMAGE_O, IMAGE_X et IMAGE_VIDE
	 */
	public void changeImageJButton(int colonne, int ligne, String s) {
		plateau[colonne][ligne].setIcon(new ImageIcon(
				JFrameTicTacToe.class.getResource(s)));
	}

	/**
	 * Cette méthode permet de modifier l'image sur le jButton
	 * @param monJButtonTicTacToe le JButton dont on veut changer l'image
	 * @param s le nom du fichier de la nouvelle image
	 */
	public static void changeImageJButton(JButtonTicTacToe monJButtonTicTacToe, String s) {
		monJButtonTicTacToe.setIcon(new ImageIcon(
				JFrameTicTacToe.class.getResource(s)));
	}

	public void ajouteActionPerformed(ActionListener al) {
		for (int c = 0; c < NBCOLONNES; c++) {
			for (int l = 0; l < NBLIGNES; l++) {
				plateau[c][l].addActionListener(al);
			}
		}
	}

}
