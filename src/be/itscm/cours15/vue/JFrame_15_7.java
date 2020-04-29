package be.itscm.cours15.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrame_15_7 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JTextField jTextFieldSomme;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame_15_7 frame = new JFrame_15_7();
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
	public JFrame_15_7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel = new JLabel("Nombre 1 : ");
		contentPane.add(lblNewLabel);

		jTextField1 = new JTextField();
		contentPane.add(jTextField1);
		jTextField1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nombre 2 :");
		contentPane.add(lblNewLabel_1);

		jTextField2 = new JTextField();
		contentPane.add(jTextField2);
		jTextField2.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Somme : ");
		contentPane.add(lblNewLabel_2);

		jTextFieldSomme = new JTextField();
		contentPane.add(jTextFieldSomme);
		jTextFieldSomme.setColumns(10);

		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(this);
		contentPane.add(btnNewButton_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()){
		case "Ajouter" :
			int nb1 = Integer.parseInt(jTextField1.getText());
			int nb2 = Integer.parseInt(jTextField2.getText());

			jTextFieldSomme.setText((nb1+nb2)+"");
			break;
		case "Cancel" :
			jTextField1.setText("");
			jTextField2.setText("");
			jTextFieldSomme.setText("");
		}
	}

}
