package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][]pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public Board(int rows, Piece[][] pieces) {
		super();
		this.rows = rows;
		this.pieces = pieces;
	}

	
	
}
