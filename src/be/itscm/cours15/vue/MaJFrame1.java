package be.itscm.cours15.vue;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MaJFrame1 extends JFrame implements ActionListener {
	private JButton jbOK = new JButton("OK"); 
	private JButton jbCancel = new JButton("Cancel"); 
	public MaJFrame1() {
		this.setVisible(true);
		this.setBounds(50,50,600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		jbOK.addActionListener(this);
		this.add(jbOK);
		jbCancel.addActionListener(this);
		this.add(jbCancel);
	}
	public static void main(String[] args) {
		MaJFrame1 mjf = new MaJFrame1();
	}

	public void actionPerformed(ActionEvent e) {
//		System.out.println("coucou");
		switch (e.getActionCommand()) {
		case "OK" : System.out.println("On a cliqué sur OK");break;
		case "Cancel" : System.out.println("on a cliqué sur Cancel");break;
		}
	}
}