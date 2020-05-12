package be.itscm.cours18.connect4.view;

import javax.swing.JButton;

public class JButtonConnect4 extends JButton {
	private int column;
	private int row;
	private boolean clickable= true;
	public int getColumn() {
		return column;
	}
	public int getRow() {
		return row;
	}
	
	public boolean isClickable() {
		return clickable;
	}
	public void setClickable(boolean clickable) {
		this.clickable = clickable;
	}
	public JButtonConnect4(int column, int row) {
		super();
		this.column = column;
		this.row = row;
	}
	
	
}
