package be.itscm.cours18.connect4.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;

public class JFrameConnect4 extends JFrame {
	private int nbrColumns = 7;
	private int nbrRows = 6;
	private JButtonConnect4 matrix[][] = new JButtonConnect4[nbrColumns][nbrRows];
	private String imageVide = "/be/itscm/cours18/connect4/images/case vide.png";
	private String imageJaune = "/be/itscm/cours18/connect4/images/case jaune.png";
	private String imageRouge = "/be/itscm/cours18/connect4/images/case rouge.png";
	public final static int EMPTY = 9;
	public final static int RED = 0;
	public final static int YELLOW = 1;
	
	private int nbrPixelsWidth = nbrColumns*50+10;
	private int nbrPixelsHeight = nbrRows*50+35;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameConnect4 frame = new JFrameConnect4();
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
	public JFrameConnect4() {
		setTitle("Connect 4");
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, nbrPixelsWidth, nbrPixelsHeight);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		for (int c = 0; c < nbrColumns; c++) {
			for (int r = 0; r < nbrRows; r++) {
				matrix[c][r] = new JButtonConnect4(c,r);
				this.changeImage(c,r,EMPTY);
				matrix[c][r].setBorder(new EmptyBorder(0,0,0,0));
				GridBagConstraints gbc = new GridBagConstraints();
				gbc.gridx = c;
				gbc.gridy = r;
				contentPane.add(matrix[c][r], gbc);
			}
		}
	}
	
	public void changeImage(int column, int row,int color) {
		switch (color) {
		case 9: matrix[column][row].setIcon(new ImageIcon(JFrameConnect4.class.getResource(imageVide))); break;
		case 0: matrix[column][row].setIcon(new ImageIcon(JFrameConnect4.class.getResource(imageRouge))); break;
		case 1: matrix[column][row].setIcon(new ImageIcon(JFrameConnect4.class.getResource(imageJaune))); break;
		}
	}
	public void setClickable(int c, int r) {
		matrix[c][r].setClickable(true);
	}
	public void setNotClickable(int c, int r) {
		matrix[c][r].setClickable(false);
	}
	public void addActionListener(ActionListener al) {
		for (int c = 0; c < nbrColumns; c++) {
			for (int r = 0; r < nbrRows; r++) {
				matrix[c][r].addActionListener(al);
			}
		}
	}

}
