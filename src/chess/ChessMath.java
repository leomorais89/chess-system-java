package chess;

import boardgame.Board;
import boardgame.Position;
import chess.peaces.King;
import chess.peaces.Rook;

public class ChessMath {

	private Board board;
	
	public ChessMath() {
		board = new Board(8, 8);
		initialSetup();
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
	
	private void initialSetup() {
		board.placePeace(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePeace(new King(board, Color.BLACK), new Position(0, 4));
		board.placePeace(new King(board, Color.WHITE), new Position(7, 4));
	}
}
