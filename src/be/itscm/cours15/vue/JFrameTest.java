package be.itscm.cours15.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class JFrameTest extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField jTextFieldPrenom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameTest frame = new JFrameTest();
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
	public JFrameTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel jLabelNom = new JLabel("Nom :");
		GridBagConstraints gbc_jLabelNom = new GridBagConstraints();
		gbc_jLabelNom.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelNom.gridx = 0;
		gbc_jLabelNom.gridy = 0;
		contentPane.add(jLabelNom, gbc_jLabelNom);
		
		jTextFieldPrenom = new JTextField();
		GridBagConstraints gbc_jTextFieldPrenom = new GridBagConstraints();
		gbc_jTextFieldPrenom.insets = new Insets(0, 0, 5, 5);
		gbc_jTextFieldPrenom.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldPrenom.gridx = 1;
		gbc_jTextFieldPrenom.gridy = 1;
		contentPane.add(jTextFieldPrenom, gbc_jTextFieldPrenom);
		jTextFieldPrenom.setColumns(10);
		
		JButton jButtonOK = new JButton("OK");
		jButtonOK.addActionListener(this);
		GridBagConstraints gbc_jButtonOK = new GridBagConstraints();
		gbc_jButtonOK.gridx = 2;
		gbc_jButtonOK.gridy = 2;
		contentPane.add(jButtonOK, gbc_jButtonOK);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("coucou");
		System.out.println(jTextFieldPrenom.getText());
		jTextFieldPrenom.setText("Toto");
	}

}
