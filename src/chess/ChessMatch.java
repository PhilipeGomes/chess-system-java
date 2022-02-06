package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8); 
	}
	
	public Piece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumm()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumm(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j); 
			}
		}
		return mat;
	}
	
}
