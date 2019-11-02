package chess.peaces;

import boardgame.Board;
import chess.ChessPeace;
import chess.Color;

public class King extends ChessPeace {

	public King(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "K";
	}
}
