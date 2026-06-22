package chess.pieces;

import javax.swing.*;

public class Pawn extends ChessPiece {

    public Pawn(ChessBoard board, int x, int y, ChessSprite.Color color){
        super(board, color == Color.WHITE? "resources/Chess_plt60.png" : "resources/Chess_pdt60.png",
                "resources/Chess_pat60.png", x, y, color);
        }


    @Override
    public boolean canMoveTo(int x, int y) {
        //super-Konstruktor gibt x und y an ChessSprite, daher können sie über die ChessSprite-Getter ausgelesen werden
        int currentX = getBoardX();
        int currentY = getBoardY();

        if (getColor() == Color.WHITE) {
            int diff = currentY-y;
            if (x == currentX) {
                if(currentY == 6 && (diff == 1 || diff == 2)) {
                    return true;
                }
                if(currentY != 6 && diff == 1){
                    return true;
                }
            }
        }

        else {
            int diff = y - currentY;
            if (x == currentX) {
                if(currentY == 1 && (diff == 1 || diff == 2)) {
                    return true;
                }
                if(currentY != 1 && diff == 1){
                    return true;
                }
            }
        }
        return false;
    }
}
