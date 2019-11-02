package aplication;

import chess.ChessMath;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChessMath chessMath = new ChessMath();
		UI.printBoard(chessMath.getPeaces());
	}

}
