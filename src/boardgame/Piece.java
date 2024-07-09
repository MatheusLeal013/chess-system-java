package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	// Acesso apenas para a classe e subclasses
	protected Board getBoard() {
		return board;
	}
	
	
}
