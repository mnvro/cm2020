package be.itscm.cours15.puissance4.view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JButtonPuissance5 extends JButton{
	private int colonne, ligne;
	public JButtonPuissance5(int colonne, int ligne) {
		this.colonne = colonne;
		this.ligne = ligne;
	}
	public int getColonne() {
		return colonne;
	}	
	public int getLigne() {
		return ligne;
	}
}

public class JFramePuissance5 extends JFrame implements ActionListener {
	private final int NBLIGNES = 7;
	private final int NBCOLONNES = 7;
	private JButtonPuissance4[][] matrice = new JButtonPuissance4[NBCOLONNES][NBLIGNES];

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramePuissance5 frame = new JFramePuissance5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFramePuissance5() {
		setTitle("Puissance 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		for (int colonne = 0 ; colonne < NBCOLONNES ; colonne++) {
			for (int ligne = 0 ; ligne < NBLIGNES ; ligne++) {
				matrice[colonne][ligne] = new JButtonPuissance4(colonne,ligne);
				matrice[colonne][ligne].addActionListener(this);
				matrice[colonne][ligne].setEnabled(true);
				matrice[colonne][ligne].setBorder(new EmptyBorder(0,0,0,0));
				matrice[colonne][ligne].setIcon(new ImageIcon(JFramePuissance5.class.getResource("/be/itscm/cours15/puissance4/images/case vide.png")));
				GridBagConstraints gbc = new GridBagConstraints();
				gbc.fill = GridBagConstraints.BOTH;
				gbc.gridx = colonne;
				gbc.gridy = ligne+1;
				contentPane.add(matrice[colonne][ligne], gbc);
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButtonPuissance4 monJButton = (JButtonPuissance4)e.getSource();
		int colonne = monJButton.getColonne();
		int ligne = monJButton.getLigne();
		matrice[colonne][ligne].setIcon(new ImageIcon(JFramePuissance5.class.getResource("/be/itscm/cours15/puissance4/images/case rouge.png")));
//		System.out.println("on a cliqu� en ("+monJButton.getColonne()+","+monJButton.getLigne()+")");
	}

}
