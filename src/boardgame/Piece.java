package boardgame;

public class Piece {

	protected Position position; // Position on matrix not on board
	private Board board;
	
	
	public Piece(Position position) {
		super();
		this.position = position;
		//board null -> piece it's not on board
	}
	
	protected Board getBoard() {
		return board;
	}
	
	
	
}
