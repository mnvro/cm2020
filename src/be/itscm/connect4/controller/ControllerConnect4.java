package be.itscm.connect4.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import be.itscm.cours18.connect4.model.Connect4;
import be.itscm.cours18.connect4.view.JButtonConnect4;
import be.itscm.cours18.connect4.view.JFrameConnect4;

public class ControllerConnect4 implements ActionListener {
	private JFrameConnect4 jFrameConnect4;
	private Connect4 connect4;

	public ControllerConnect4() {
		jFrameConnect4 = new JFrameConnect4();
		jFrameConnect4.setVisible(true);
		jFrameConnect4.addActionListener(this);
		connect4 = new Connect4();
		jFrameConnect4.setTitle(Connect4.tabColorString[connect4.getTurn()]+"'s turn");
//		for (int c=0 ; c<7 ; c++) {
//			jFrameConnect4.setClickable(c, 5);
//		}
	}

	public void actionPerformed(ActionEvent e) {
		JButtonConnect4 jbc4 = (JButtonConnect4)e.getSource();
		if(jbc4.isClickable()) {
			int c = jbc4.getColumn();
			//int r = jbc4.getRow();
			int r = connect4.findFreeCell(c);
			//System.out.println("on a cliqué en "+c+" "+r);
			int color = connect4.getTurn();
			jFrameConnect4.changeImage(c, r, color);
			connect4.play(c);
			int theWinner = connect4.win();
			if (theWinner>=0) {
				JOptionPane.showMessageDialog(jFrameConnect4, "The "+Connect4.tabColorString[theWinner]+" wins");
				new ControllerConnect4();
			}else {
				jFrameConnect4.setNotClickable(c,r);
				jFrameConnect4.setTitle(Connect4.tabColorString[connect4.getTurn()]+"'s turn");
				if (r>0)
					jFrameConnect4.setClickable(c, r-1);
			}
		}

	}
	public static void main(String[] args) {
		new ControllerConnect4();
	}
}
