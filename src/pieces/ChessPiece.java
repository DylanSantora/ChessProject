package pieces;

import java.util.ArrayList;

import location.ChessBoard;
import location.Location;
/**
 *  Chess Piece class that all pieces will extend.
 */

public class ChessPiece {
    private int myColor;
    private String myPieceType;

    public ChessPiece() {
        myColor = -1;
        myPieceType = "n/a";
    }

    public ChessPiece(int color) {
        myColor = color;
        myPieceType = "n/a";
    }
    
    public int getMyColor() {
    	return myColor;
    }

    public void setMyColor(int color) {
    	myColor = color;
    }
    
    public String getMyPieceType() {
    	return myPieceType;
    }

    public void move() {
        // TODO
        /**
         * move remains same across all pieces:
         * each piece will execute a move in the same way after getting its move locations
         */
    }

    public void processActors() {
        // TODO, change method signature
        /**
         * processActors remains same across all pieces:
         * every piece will capture pieces in the same way
         */
    }

    public void removeSelf() {
        // TODO, change method signature
        /**
         * removeSelf remains same from piece to piece:
         * every piece will have to remove itself when it's been captured
         */
    }

}
//https://commons.wikimedia.org/wiki/Category:SVG_chess_pieces
