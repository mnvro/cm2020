package be.itscm.cours20;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import be.itscm.cours19.MonServeur;

import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.event.ActionEvent;

public class JFrameServeur extends JFrame implements ActionListener,Runnable {

	private JPanel contentPane;
	private JTextArea txtrConsoleDuServeur;
	private JButton jButtonLancerServeur;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameServeur frame = new JFrameServeur();
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
	public JFrameServeur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtrConsoleDuServeur = new JTextArea();
		txtrConsoleDuServeur.setText("Console du serveur");
		contentPane.add(txtrConsoleDuServeur);
		
		jButtonLancerServeur = new JButton("D\u00E9marrer le serveur");
		jButtonLancerServeur.addActionListener(this);
		contentPane.add(jButtonLancerServeur);
	}
	
	public void run() {
		try {
			ServerSocket monServeur = new ServerSocket(0);
			txtrConsoleDuServeur.append("\nLe Serveur est démarré. \nOn attend le premier client.");
			txtrConsoleDuServeur.append("\nOn écoute sur le port "+monServeur.getLocalPort());
			jButtonLancerServeur.setVisible(false);
			Socket client = monServeur.accept();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		new Thread(this).start();	
	}

}
