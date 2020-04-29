package be.itscm.cours15.vue;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MaFenetre extends JFrame implements MouseListener {
	private JButton monJButton = new JButton("OK");
	public MaFenetre() {
		this.setVisible(true);
		this.setBounds(300, 200, 300, 100);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Ma première JFrame");
		this.getContentPane().add(monJButton);
		this.addMouseListener(this);
	}

	public static void main(String[] args) {
		MaFenetre mf = new MaFenetre();
		
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("on a cliqué en ("+e.getX()+","+e.getY()+")");
	}

	public void mousePressed(MouseEvent e) {
//		System.out.println("on a appuyé");
		
	}

	public void mouseReleased(MouseEvent e) {
//		System.out.println("On a relâché");
	}

	public void mouseEntered(MouseEvent e) {
//		System.out.println("on est entré");
	}

	public void mouseExited(MouseEvent e) {
//		System.out.println("on est sorti");
	}

}
