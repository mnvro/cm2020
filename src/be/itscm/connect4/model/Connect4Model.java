package be.itscm.connect4.model;

import javax.swing.JOptionPane;

/**
 * The Connect 4 game
 * @author Marie-Noël Vroman
 *
 */
public class Connect4Model {
	/*
	 * The constants of Connect4
	 */
	public final static int EMPTY = 9;
	public final static int RED = 0;
	public final static int YELLOW = 1;
	public final static int tabColor[] = {RED,YELLOW};
	public final static String tabColorString[] = {"Red","Yellow"};
	public final static int NBR_COLUMNS = 7;
	public final static int NBR_ROWS = 6;

	private int matrix[][] = new int [NBR_COLUMNS][NBR_ROWS];
	private int turn = 0;// it's the reds who begin
	private int nbTurn = 0;
	public Connect4Model() {
		for (int c=0;c<NBR_COLUMNS;c++)
			for (int r=0;r<NBR_ROWS;r++)
				matrix[c][r]=EMPTY;
	}

	/**
	 * @param column The column where we seek the lower empty cell
	 * @return 	-1 if the column is full
	 * 			the row of the lower empty cell if it exists.
	 */
	public int findFreeCell(int column) {
		int i = NBR_ROWS-1;
		while (i>=0 && matrix[column][i]!=EMPTY) {
			i--;
		}
		return i;
	}

	public void play (int column) {
		int row = findFreeCell(column);
		if (row == -1)
			System.out.println("Pas autorisé");
		else {
			matrix[column][row] = tabColor[turn];
			nbTurn++;
			turn = (++turn%2);
		}
	}
	
	

	/**
	 * @param oColumn origin column
	 * @param oRow origni row
	 * @param deltaColumn delta in column
	 * @param deltaRow delta in row
	 * @return true if there are 4 aligned items
	 */
	public boolean find4alignedItems(int oColumn, int oRow, int deltaColumn, int deltaRow) {
		int color = EMPTY;
		int counter = 0;

		int curCol = oColumn;
		int curRow = oRow;

		while(curCol < NBR_COLUMNS && curCol >=0 && curRow < NBR_ROWS && curRow >=0) {
			if (matrix[curCol][curRow]!=color) {
				color = matrix[curCol][curRow];
				counter = 1;
			} else {
				counter++;
				if (color != EMPTY && counter == 4)
					return true;
			}
			curCol += deltaColumn;
			curRow += deltaRow; 	
		}
		return false;
	}

	/**
	 * @return 	0 if the reds win, 
	 * 			1 if the yellows win, 
	 * 			-1 while the game is not finished, 
	 * 			-2 if it is a draw (the matix is full without 4 aligned items
	 */
	public int win() {
		// Find 4 aligned items in the same row
		for (int r=0;r<NBR_ROWS;r++) {
			if (find4alignedItems(0,r,1,0)) return ++turn%2;
		}

		// Find 4 aligned items in the same column
		for (int c=0;c<NBR_COLUMNS;c++) {
			if (find4alignedItems(c,0,0,1)) return ++turn%2; 
		}

		// Find 4 aligned items in the first diagonal \
		for (int r=0;r<NBR_ROWS;r++) {// on commence en haut à gauche r++ on teste une ligne plus bas
			if (find4alignedItems(0,r,1,1)) return ++turn%2;
		}
		for (int c=0;c<NBR_COLUMNS;c++) {// on commence en haut à gauche c++ on teste une colonne plus à droite
			if (find4alignedItems(c,0,1,1)) return ++turn%2;
		}

		// Find 4 aligned items in the second diagonal /
		for (int r=NBR_ROWS-1;r>=0;r--) {// on commence en bas à gauche r-- on teste une ligne plus haut
			if (find4alignedItems(0,r,1,-1)) return ++turn%2;
		}
		for (int c=0;c<NBR_COLUMNS;c++) {// on commence en bas à gauche c++ on teste une colonne plus à droite
			if (find4alignedItems(c,NBR_ROWS-1,1,-1)) return ++turn%2;
		}

		if (nbTurn == NBR_COLUMNS*NBR_ROWS) return -2;
		return -1;
	}
	public int playAndWin(int column) {
		int row = findFreeCell(column);
		if (row == -1)
			return -1;
		else {
			matrix[column][row] = tabColor[turn];
			nbTurn++;
			turn = (++turn%2);
		}
		return win();
	}
	public String toStringFirstLine() {
		String s = "┌";
		for (int c = 0 ; c < NBR_COLUMNS-1 ; c++) {
			s+="───┬";
		}
		s+="───┐\n";
		return s;
	}
	public String toStringLastLine() {
		//└───┴───┴───┘
		String s = "└";
		for (int c = 0 ; c < NBR_COLUMNS-1 ; c++) {
			s+="───┴";
		}
		s+="───┘\n";
		return s;
	}
	public String toStringMiddleLine() {
		//├───┼───┼───┤
		String s = "├";
		for (int c = 0 ; c < NBR_COLUMNS-1 ; c++) {
			s+="───┼";
		}
		s+="───┤\n";
		return s;
	}
	public String toStringTrueLine(int r) {
		//"│ "+matrix[0][1]+" │ "+matrix[1][1]+" │ "+matrix[2][1]+" │\n";
		String s = "│ ";
		for (int c = 0 ; c < NBR_COLUMNS-1 ; c++) {
			s+=matrix[c][r]+" │ ";
		}
		s+=matrix[NBR_COLUMNS-1][r]+" │\n";
		return s;
	}

	public String toString() {
		String s=toStringFirstLine();	
		for (int r = 0 ; r < NBR_ROWS-1 ; r++) {
			s+=toStringTrueLine(r);
			s+=toStringMiddleLine();
		}
		s+=toStringTrueLine(NBR_ROWS-1);
		s+=toStringLastLine();
		//remove the empty cell - replace 0 by R and 1 by Y
		String s2="";
		for (int i=0 ; i<s.length();i++)
			switch (s.charAt(i)) {
			case '9' : s2+=" "; break;
			case '0' : s2+="R"; break;
			case '1' : s2+="Y"; break;
			default: s2+=s.charAt(i);
			}
		s2+="  1   2   3   4   5   6  7\n";
		return s2;
	}
	public void justForTestingRWins(int[] tabColumn) {

		System.out.println(this.toString());
		System.out.println("la valeur de gagnant vaut actuellement : "+this.win());
		for (int i = 0; i < tabColumn.length; i++) {
			System.out.println("on joue "+tabColumn[i]);
			play(tabColumn[i]-1);
			System.out.println(this.toString());
			System.out.println("la valeur de gagnant vaut actuellement : "+this.win());
		}
	}

	public int getTurn() {
		return turn;
	}

	public static void main(String[] args) {

		Connect4Model connect4 = new Connect4Model();
		int whoWins = -1;
		do {
			System.out.println(connect4.toString());
			String message= "It is ";
			message += tabColorString[connect4.turn];
			System.out.println(message + "'s turn");
			String s = JOptionPane.showInputDialog("The column number (1-7) for exemple 1 for the left");
			int column = Integer.parseInt(s);
			column--;
			connect4.play(column);
			whoWins = connect4.win();
		}while (whoWins==-1);
		System.out.println(connect4.toString());
		switch (whoWins) {
		case  0 : JOptionPane.showMessageDialog(null, "Red wins"); break;
		case  1 : JOptionPane.showMessageDialog(null, "Yellow wins"); break;
		case -2 : JOptionPane.showMessageDialog(null, "It is a draw!"); break;
		}
	}
}
