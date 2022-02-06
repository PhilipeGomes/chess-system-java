package boardgame;

public class Piece {

	protected Position position; // Position on matrix not on board
	private Board board;
	
	
	public Piece(Board board) {
		board = this.board;
	}
	
	protected Board getBoard() {
		return board;
	}
	
	
	
}
