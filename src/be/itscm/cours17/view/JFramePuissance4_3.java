package be.itscm.cours17.view;

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



/**
 * Solution de l'exercice 17.3
 * Changez l’image quand on clique: cela devient l’image avec le pion rouge ou le pion jaune 
 * (chaque fois que l’on clique on change de couleur)
 *
 * @author mnv
 *
 */
public class JFramePuissance4_3 extends JFrame implements ActionListener {
	private final int NBCOLONNES = 7;
	private final int NBLIGNES = 7;
	private int couleurEnCours = JButtonPuissance4.COULEUR_JAUNE;
	
	private JButtonPuissance4 matrice[][] = new JButtonPuissance4[NBCOLONNES][NBLIGNES];

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramePuissance4_3 frame = new JFramePuissance4_3();
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
	public JFramePuissance4_3() {
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
				matrice[c][l] = new JButtonPuissance4(c,l,JButtonPuissance4.COULEUR_AUCUNE);
				matrice[c][l].addActionListener(this);
				matrice[c][l].setIcon(new ImageIcon(JFramePuissance4_3.class.getResource("/be/itscm/cours17/images/case vide.png")));
				matrice[c][l].setBorder(new EmptyBorder(0, 0, 0, 0));
				GridBagConstraints gbc = new GridBagConstraints();
				gbc.gridx = c;
				gbc.gridy = l+1;
				contentPane.add(matrice[c][l], gbc);
			}
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButtonPuissance4 monButtonPuissance4 = (JButtonPuissance4)e.getSource();
		int c = monButtonPuissance4.getColonne();
		int l = monButtonPuissance4.getLigne();
//		int color = monButtonPuissance4.getColor();
		
		if (couleurEnCours == JButtonPuissance4.COULEUR_JAUNE) {
			matrice[c][l].setIcon(new ImageIcon(JFramePuissance4_3.class.getResource("/be/itscm/cours17/images/case rouge.png")));
			matrice[c][l].setColor(JButtonPuissance4.COULEUR_ROUGE);
			couleurEnCours = JButtonPuissance4.COULEUR_ROUGE;
		}else {
			matrice[c][l].setIcon(new ImageIcon(JFramePuissance4_3.class.getResource("/be/itscm/cours17/images/case jaune.png")));
			matrice[c][l].setColor(JButtonPuissance4.COULEUR_JAUNE);
			couleurEnCours = JButtonPuissance4.COULEUR_JAUNE;
		}
		
//		System.out.println("on a cliqué en ("+monButtonPuissance4.getColonne()+","+monButtonPuissance4.getLigne()+")");
		
	}

}

	