package boardgame;

public class Board {

	private Integer rows;
	private Integer columns;
	
	private Peace[][] peaces;
	
	public Board() {
		
	}

	public Board(Integer rows, Integer columns) {
		super();
		this.rows = rows;
		this.columns = columns;
		peaces = new Peace[rows][columns];
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getColumns() {
		return columns;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}
	
	public Peace peace(int row, int column) {
		return peaces[row][column];
	}
	
	public Peace peace(Position position) {
		return peaces[position.getRow()][position.getColumn()];
	}
}
