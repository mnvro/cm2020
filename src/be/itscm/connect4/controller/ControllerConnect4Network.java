package be.itscm.connect4.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import be.itscm.connect4.model.Connect4Model;
import be.itscm.connect4.tcp.Connect4Client;
import be.itscm.connect4.tcp.Connect4Server;
import be.itscm.cours18.connect4.view.JButtonConnect4;
import be.itscm.cours18.connect4.view.JFrameConnect4;

public class ControllerConnect4Network implements ActionListener, Runnable {
	private JFrameConnect4 jFrameConnect4;
	private Connect4Model connect4Model;
	private Connect4Server server;
	private Connect4Client client;
	private boolean modeServer;
	private boolean myTurn;

	public ControllerConnect4Network(boolean modeServeur) {
		this.modeServer = modeServeur;
		try {
			jFrameConnect4 = new JFrameConnect4();
			jFrameConnect4.setVisible(true);
			jFrameConnect4.addActionListener(this);
			connect4Model = new Connect4Model();
			if (modeServer) {
				server = new Connect4Server();
				myTurn = true;
			}else {
				client = new Connect4Client();
				myTurn = false;
				int c = Integer.parseInt(this.receiveMessage().toString());
				myTurn = true;
				int color = connect4Model.getTurn();
				int r = connect4Model.findFreeCell(c);
				jFrameConnect4.changeImage(c, r, color);
				connect4Model.play(c); 
			}
			jFrameConnect4.setTitle(Connect4Model.tabColorString[connect4Model.getTurn()]+"'s turn");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void actionPerformed(ActionEvent e) {
		if (myTurn) {
			myTurn = false;
			JButtonConnect4 jbc4 = (JButtonConnect4)e.getSource();
			if(jbc4.isClickable()) {
				int c = jbc4.getColumn();
				//int r = jbc4.getRow();
				int r = connect4Model.findFreeCell(c);
				//System.out.println("on a cliqué en "+c+" "+r);
				int color = connect4Model.getTurn();
				jFrameConnect4.changeImage(c, r, color);
				jFrameConnect4.pack();
				System.out.println("ici 1");
				//connect4.play(c);
				this.sentMessage(c); 
				System.out.println("on a envoyé le message");
				int theWinner = connect4Model.playAndWin(c);
				if (theWinner>=0) {
					JOptionPane.showMessageDialog(jFrameConnect4, "The "+Connect4Model.tabColorString[theWinner]+" wins");
					new ControllerConnect4();
				}else {
					jFrameConnect4.setNotClickable(c,r);
					jFrameConnect4.setTitle(Connect4Model.tabColorString[connect4Model.getTurn()]+"'s turn");
					if (r>0)
						jFrameConnect4.setClickable(c, r-1);
					System.out.println("ici 2");
					new Thread().start();
				}
			}
		}
	}
	public Object receiveMessage() {
		if (modeServer) {
			return server.receiveMessage();
		}
		return client.receiveMessage();
	}
	public void sentMessage(Object o) {
		if (modeServer) {
			server.sentMessage(o);
		}else {
			client.sentMessage(o);
		}
	}
	public static void main(String[] args) {
		String answer="";
		if (args.length>=0) {
			answer = args[0];
		}else {
			answer = JOptionPane.showInputDialog("Mode serveur (O/n)?");
			answer = answer.toLowerCase();
		}
		switch (answer.charAt(0)) {
		case 'o' : new ControllerConnect4Network(true); System.out.println("Console du serveur");break;
		case 'n' : new ControllerConnect4Network(false);System.out.println("Console du client");break;
		}
	}

	@Override
	public void run() {
		int c = Integer.parseInt(this.receiveMessage().toString());
		//System.out.println("on a reçu le message");
		myTurn = true;
		System.out.println("My turn = "+myTurn);
		int color = connect4Model.getTurn();
		int r = connect4Model.findFreeCell(c);
		jFrameConnect4.changeImage(c, r, color);
		int theWinner = connect4Model.playAndWin(c);
		if (theWinner>=0) {
			JOptionPane.showMessageDialog(jFrameConnect4, "The "+Connect4Model.tabColorString[theWinner]+" wins");
			new ControllerConnect4();
		}

	}
}
