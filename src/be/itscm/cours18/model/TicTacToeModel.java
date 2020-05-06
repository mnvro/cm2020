package be.itscm.cours18.model;

import javax.swing.JOptionPane;

public class TicTacToeModel {
	/**
	 * the number of columns
	 */
	public final static int nbrColumns = 3;
	/**
	 * the number of rows
	 */
	private final static int nbrRows = 3;

	/**
	 * The array that contains The tow symbols 'O' and 'X'
	 */
	public final static char ARRAY_CHAR[] = {'O','X'};
	/**
	 * When the turn == 0 it is the turn of ARRAY_CHAR[0] to plays then it is the turn of O
	 * When the turn == 1 it is the turn of ARRAY_CHAR[1] to plays then it is the turn of X
	 */
	private int turn = 0; // It is the O who begins
	private int nbrTurn = 0;
	private char matrix[][] = new char[nbrColumns][nbrRows];

	/**
	 * That constructs the void matrix 
	 */
	public TicTacToeModel() {
		for (int c=0 ; c<nbrColumns ; c++) {
			for (int r=0 ; r<nbrRows ; r++) {
				matrix[c][r] = ' '; // In the begin the matrix is void
			}
		}
	}

	/**
	 * to get the turn of who must play
	 * @return 0 or 1 - if 0 it is the turn of O to play, if 1 it is the turn of X to play
	 */
	public int getTurn() {
		return turn;
	}

	/**
	 * change the turn of who must play
	 * @param turn 0 or 1 - if 0 it sets it is the turn of O to play, if 1 it sets it is the turn of X to play
	 */
	public void setTurn(int tour) {
		this.turn = tour;
	}

	/**
	 * @param i The index in ARRAY_CHAR of the item we are looking for
	 * 			for example if i == 0 we are looking for the char ARRAY_CHAR[0] and then the char O
	 * 			            if i == 1 we are looking for the char ARRAY_CHAR[1] and then the char X
	 * @return 	-1 if we don't find the item in a row, a column or a diagonal
	 * 			0 if we find 3 ARRAY_CHAR[0] align (then 3 O align)
	 * 			1 if we find 3 ARRAY_CHAR[1] align (then 3 X align)
	 */	
	public int win (int i) {
		int theWinner = -1;
		//looking 3 items the same in lines
		for (int r=0 ; r<nbrRows ; r++) {
			if ((matrix[0][r]==ARRAY_CHAR[i]) && (matrix[1][r]==ARRAY_CHAR[i]) && (matrix[2][r]==ARRAY_CHAR[i]))
				return i;
		}
		//looking in columns 
		for (int c=0 ; c<nbrColumns ; c++) {
			if ((matrix[c][0]==ARRAY_CHAR[i]) && (matrix[c][1]==ARRAY_CHAR[i]) && (matrix[c][2]==ARRAY_CHAR[i]))
				return i;
		}
		//looking in diagonals
		if ((matrix[0][0]==ARRAY_CHAR[i]) && (matrix[1][1]==ARRAY_CHAR[i]) && (matrix[2][2]==ARRAY_CHAR[i]))
			return i;
		if ((matrix[0][2]==ARRAY_CHAR[i]) && (matrix[1][1]==ARRAY_CHAR[i]) && (matrix[2][0]==ARRAY_CHAR[i]))
			return i;
		return theWinner;
	}

	/**
	 * @return 	-1 while the game is not finished
	 * 			-2 if it is a null match (all the matrix is filled without 3 items align)
	 * 			else the index of the winner (0 or 1)
	 */
	public int win() {
		int win0 = win(0);
		if (win0!=-1) return win0;
		int win1 = win(1);
		if (win1!=-1) return win1;
		if (nbrTurn==9) return -2;
		return -1;
	}

	/**
	 * Place a O or a X in the cell in function of the turn  
	 * @param column The column of the cell where to play
	 * @param row The row of the cell where to play
	 */
	public void play(int column, int row) {
		if (matrix[column][row] == ' ') 
			matrix[column][row] = ARRAY_CHAR[turn];
		turn = ++turn%2;
		this.nbrTurn++;
	}


	public String toString() {
		String s ="It is the turn of "+ARRAY_CHAR[turn]+" to play\n";
		s += "┌───┬───┬───┐\n";
		s += "│ "+matrix[0][0]+" │ "+matrix[1][0]+" │ "+matrix[2][0]+" │\n";
		s += "├───┼───┼───┤\n";
		s += "│ "+matrix[0][1]+" │ "+matrix[1][1]+" │ "+matrix[2][1]+" │\n";
		s += "├───┼───┼───┤\n";
		s += "│ "+matrix[0][2]+" │ "+matrix[1][2]+" │ "+matrix[2][2]+" │\n";
		s += "└───┴───┴───┘\n";

		return s;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TicTacToeModel ticTacToe = new TicTacToeModel();

		int whoWins = -1;
		do {
			System.out.println(ticTacToe);
			String s =JOptionPane.showInputDialog("Which case do you like to play? column,row fo example 0,0 for the first cell");
			String tabS[] = s.split(",");
			int column = Integer.parseInt(tabS[0]);
			int row = Integer.parseInt(tabS[1]);
			ticTacToe.play(column, row);
			whoWins = ticTacToe.win();
		} while ((whoWins==-1)&&(ticTacToe.nbrTurn<9));
		System.out.println(ticTacToe);
		if(whoWins>=0) 
			JOptionPane.showMessageDialog(null, ticTacToe.ARRAY_CHAR[whoWins]+" is the winner");
		else
			JOptionPane.showMessageDialog(null, "No player wins");
	}
}
