package pieces;

import location.Location;

import java.util.ArrayList;

public class King extends ChessPiece {
    private int myColor;
    private String myPieceType;
    
    public King(int color) {
        super();
        setMyColor(color);
        myPieceType = "king";
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

    public void setMyPieceType(String pieceType) {
        myPieceType = pieceType;
    }
}
