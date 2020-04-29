package be.itscm.cours15.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MaJFrameEx15_6 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtToto;
	private JTextField txtBonjour;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaJFrameEx15_6 frame = new MaJFrameEx15_6();
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
	public MaJFrameEx15_6() {
		setTitle("Exercice 15.6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 168, 126);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtToto = new JTextField();
		txtToto.setText("toto");
		contentPane.add(txtToto);
		txtToto.setColumns(10);
		
		txtBonjour = new JTextField();
		txtBonjour.setText("bonjour");
		contentPane.add(txtBonjour);
		txtBonjour.setColumns(10);
		
		JButton btnNewButton = new JButton("Swap");
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = txtBonjour.getText();
		txtBonjour.setText(txtToto.getText());
		txtToto.setText(s);
	}
}
