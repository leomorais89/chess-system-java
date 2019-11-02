package boardgame;

public class Peace {

	protected Position position;
	
	private Board board;
	
	public Peace() {
		
	}

	public Peace(Board board) {
		super();
		this.board = board;
	}

	public Board getBoard() {
		return board;
	}	
}
