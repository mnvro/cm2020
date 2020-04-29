package be.itscm.cours17.vue;

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

class JButtonPuissance4 extends JButton{
	private int colonne, ligne;

	public JButtonPuissance4(int colonne, int ligne) {
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

public class JFramePuissance4_1 extends JFrame implements ActionListener {
	private final int NBCOLONNES = 7;
	private final int NBLIGNES = 7;
	
	private JButtonPuissance4 matrice[][] = new JButtonPuissance4[NBCOLONNES][NBLIGNES];

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramePuissance4_1 frame = new JFramePuissance4_1();
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
	public JFramePuissance4_1() {
		setTitle("Puissance 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		for (int c = 0 ; c < NBCOLONNES ; c++) {
			for (int l = 0 ; l < NBLIGNES ; l++) {
				matrice[c][l] = new JButtonPuissance4(c,l);
				matrice[c][l].addActionListener(this);
				matrice[c][l].setIcon(new ImageIcon(JFramePuissance4_1.class.getResource("/be/itscm/cours17/images/case vide.png")));
				matrice[c][l].setBorder(new EmptyBorder(0, 0, 0, 0));
				GridBagConstraints gbc = new GridBagConstraints();
				gbc.gridx = c;
				gbc.gridy = l;
				contentPane.add(matrice[c][l], gbc);
			}
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButtonPuissance4 monButtonPuissance4 = (JButtonPuissance4)e.getSource();
		System.out.println("on a cliqu� en ("+monButtonPuissance4.getColonne()+","+monButtonPuissance4.getLigne()+")");
		
	}

}