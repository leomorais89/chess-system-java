package aplication;

import chess.ChessPeace;

public class UI {

	public static void printBoard(ChessPeace[][] peaces) {
		for (int i=0; i<peaces.length; i++) {
			System.out.print(8 - i + " ");
			for (int j=0; j<peaces.length; j++) {
				printPeace(peaces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	private static void printPeace(ChessPeace peace) {
		if (peace == null) {
			System.out.print("-");
		} else {
			System.out.print(peace);
		}
		System.out.print(" ");
	}
}
