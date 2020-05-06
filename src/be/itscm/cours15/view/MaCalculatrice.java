package be.itscm.cours15.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class MaCalculatrice extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField jTextFieldSolution;
	private JButton tabJbutton[] = new JButton[10];
	private JButton jButtonCancel;
	int nb1, nb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaCalculatrice frame = new MaCalculatrice();
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
	public MaCalculatrice() {
		setTitle("Calculatrice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 262, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		jTextFieldSolution = new JTextField();
		GridBagConstraints gbc_jTextFieldSolution = new GridBagConstraints();
		gbc_jTextFieldSolution.gridwidth = 3;
		gbc_jTextFieldSolution.insets = new Insets(0, 0, 5, 5);
		gbc_jTextFieldSolution.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldSolution.gridx = 0;
		gbc_jTextFieldSolution.gridy = 0;
		contentPane.add(jTextFieldSolution, gbc_jTextFieldSolution);
		jTextFieldSolution.setColumns(10);
		
		tabJbutton[7] = new JButton("7");
		GridBagConstraints gbc_jButton7 = new GridBagConstraints();
		gbc_jButton7.insets = new Insets(0, 0, 5, 5);
		gbc_jButton7.gridx = 0;
		gbc_jButton7.gridy = 1;
		contentPane.add(tabJbutton[7], gbc_jButton7);
		
		tabJbutton[8] = new JButton("8");
		GridBagConstraints gbc_jButton8 = new GridBagConstraints();
		gbc_jButton8.insets = new Insets(0, 0, 5, 5);
		gbc_jButton8.gridx = 1;
		gbc_jButton8.gridy = 1;
		contentPane.add(tabJbutton[8], gbc_jButton8);
		
		tabJbutton[9] = new JButton("9");
		GridBagConstraints gbc_jButton9 = new GridBagConstraints();
		gbc_jButton9.insets = new Insets(0, 0, 5, 5);
		gbc_jButton9.gridx = 2;
		gbc_jButton9.gridy = 1;
		contentPane.add(tabJbutton[9], gbc_jButton9);
		
		tabJbutton[4] = new JButton("4");
		GridBagConstraints gbc_jButton4 = new GridBagConstraints();
		gbc_jButton4.insets = new Insets(0, 0, 5, 5);
		gbc_jButton4.gridx = 0;
		gbc_jButton4.gridy = 2;
		contentPane.add(tabJbutton[4], gbc_jButton4);
		
		tabJbutton[5] = new JButton("5");
		GridBagConstraints gbc_jButton5 = new GridBagConstraints();
		gbc_jButton5.insets = new Insets(0, 0, 5, 5);
		gbc_jButton5.gridx = 1;
		gbc_jButton5.gridy = 2;
		contentPane.add(tabJbutton[5], gbc_jButton5);
		
		tabJbutton[6] = new JButton("6");
		GridBagConstraints gbc_jButton6 = new GridBagConstraints();
		gbc_jButton6.insets = new Insets(0, 0, 5, 5);
		gbc_jButton6.gridx = 2;
		gbc_jButton6.gridy = 2;
		contentPane.add(tabJbutton[6], gbc_jButton6);
		
		tabJbutton[1] = new JButton("1");
		GridBagConstraints gbc_jButton1 = new GridBagConstraints();
		gbc_jButton1.insets = new Insets(0, 0, 5, 5);
		gbc_jButton1.gridx = 0;
		gbc_jButton1.gridy = 3;
		contentPane.add(tabJbutton[1], gbc_jButton1);
		
		tabJbutton[2] = new JButton("2");
		GridBagConstraints gbc_jButton2 = new GridBagConstraints();
		gbc_jButton2.insets = new Insets(0, 0, 5, 5);
		gbc_jButton2.gridx = 1;
		gbc_jButton2.gridy = 3;
		contentPane.add(tabJbutton[2], gbc_jButton2);
		
		tabJbutton[3] = new JButton("3");
		GridBagConstraints gbc_jButton3 = new GridBagConstraints();
		gbc_jButton3.insets = new Insets(0, 0, 5, 5);
		gbc_jButton3.gridx = 2;
		gbc_jButton3.gridy = 3;
		contentPane.add(tabJbutton[3], gbc_jButton3);
		
		tabJbutton[0] = new JButton("0");
		GridBagConstraints gbc_jButton0 = new GridBagConstraints();
		gbc_jButton0.insets = new Insets(0, 0, 0, 5);
		gbc_jButton0.gridx = 1;
		gbc_jButton0.gridy = 4;
		contentPane.add(tabJbutton[0], gbc_jButton0);
		
		for (int i = 0; i < tabJbutton.length; i++) {
			tabJbutton[i].addActionListener(this);
		}
		
		JButton jButtonPlus = new JButton("+");
		GridBagConstraints gbc_jButtonPlus = new GridBagConstraints();
		gbc_jButtonPlus.insets = new Insets(0, 0, 5, 0);
		gbc_jButtonPlus.gridx = 3;
		gbc_jButtonPlus.gridy = 0;
		jButtonPlus.addActionListener(this);
		contentPane.add(jButtonPlus, gbc_jButtonPlus);
		
		JButton jButtonEgale = new JButton("=");
		GridBagConstraints gbc_jButtonEgale = new GridBagConstraints();
		gbc_jButtonEgale.insets = new Insets(0, 0, 5, 0);
		gbc_jButtonEgale.gridx = 3;
		gbc_jButtonEgale.gridy = 1;
		jButtonEgale.addActionListener(this);
		contentPane.add(jButtonEgale, gbc_jButtonEgale);
		
		jButtonCancel = new JButton("Cancel");
		GridBagConstraints gbc_jButtonCancel = new GridBagConstraints();
		gbc_jButtonCancel.insets = new Insets(0, 0, 5, 0);
		gbc_jButtonCancel.gridx = 3;
		gbc_jButtonCancel.gridy = 2;
		jButtonCancel.addActionListener(this);
		contentPane.add(jButtonCancel, gbc_jButtonCancel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "Cancel" : 
			jTextFieldSolution.setText("");
			break;
		case "+" :
			nb1 = Integer.parseInt(jTextFieldSolution.getText());
			jTextFieldSolution.setText("");
			break;
		case "=" :
			nb2 = Integer.parseInt(jTextFieldSolution.getText());
			jTextFieldSolution.setText((nb1+nb2)+"");
			break;
		default:
			jTextFieldSolution.setText(jTextFieldSolution.getText()+e.getActionCommand());		
		}
	}

}
