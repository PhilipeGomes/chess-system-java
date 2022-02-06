package boardgame;

public class Board {
	
	private int rows;
	private int columm;
	private Piece[][] pieces;
	
	public Board(int rows, int columm) {
		this.rows = rows;
		this.columm = columm;
		pieces = new Piece[rows][columm];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumm() {
		return columm;
	}

	public void setColumm(int columm) {
		this.columm = columm;
	}
	
	public Piece piece(int row, int columm ) {
		return pieces[row][columm];
	}
	
	public Piece piece(Position poisition) {
		return pieces[poisition.getRow()][poisition.getColumm()];
	}
	
}
