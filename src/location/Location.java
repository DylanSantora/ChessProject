package location;
import pieces.ChessPiece;

public class Location {
    private int myRow;
    private int myCol;
    private ChessPiece myChessPiece;

    public Location() {
        setRow(0);
        setCol(0);
        setChessPiece(null);
    }

    public Location(int row, int col, ChessPiece piece) {
        setRow(row);
        setCol(col);
        setChessPiece(piece);
    }
    
    public Location(int row, int col)
    {
    	setRow(row);
    	setCol(col);
    	setChessPiece(null);
    }

    public int getCol() {
        return myCol;
    }

    public void setCol(int col) {
        myCol = col;
    }

    public int getRow() {
        return myRow;
    }

    public void setRow(int row) {
        myRow = row;
    }
    
    public boolean equals(Location loc) {
        return ((myCol == loc.getCol()) && (myRow == loc.getRow()));
    }

    public ChessPiece getChessPiece() {
        return myChessPiece;
    }

    public void setChessPiece(ChessPiece piece) {
        myChessPiece = piece;
    }
    
    public void print()
    {
    	System.out.println(myRow + " " + myCol);
    }

	public boolean isInGrid() {
		  int row = myRow;
	        int col = myCol;
	        if ((row>=0&&row<=7)&&(col>=0&&col<=7))
	        {
	        	return true;
	        }
	        return false;
	}
}
