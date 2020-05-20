package be.itscm.cours20;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class JFrameServeur2 extends JFrame implements ActionListener,Runnable {

	private JPanel contentPane;
	private JButton jButtonLancerServeur;
	private ServerSocket serveur;
	private Socket client;
	private JTextArea txtrConsoleDuServeur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameServeur2 frame = new JFrameServeur2();
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
	public JFrameServeur2() {
		setTitle("Serveur TCP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		jButtonLancerServeur = new JButton("Lancer le Serveur");
		jButtonLancerServeur.addActionListener(this);
		
		txtrConsoleDuServeur = new JTextArea();
		txtrConsoleDuServeur.setText("Console du Serveur\n");
		txtrConsoleDuServeur.append( "==================\n");
		contentPane.add(txtrConsoleDuServeur);
		contentPane.add(jButtonLancerServeur);
	}

	public void actionPerformed(ActionEvent e) {
		jButtonLancerServeur.setVisible(false);
		new Thread(this).start();
		
	}

	public void run() {
		try {
			serveur = new ServerSocket(2020);
			txtrConsoleDuServeur.append("On écoute sur le port "+serveur.getLocalPort());
			client = serveur.accept();	
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
