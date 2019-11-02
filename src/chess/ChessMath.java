package chess;

import boardgame.Board;

public class ChessMath {

	private Board board;
	
	public ChessMath() {
		board = new Board(8, 8);
	}
	
	public ChessPeace[][] getPeaces() {
		ChessPeace[][] mat = new ChessPeace[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++ ) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPeace) board.peace(i, j);
			}
		}
		return mat;
	}
}
