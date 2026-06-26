package chess.pieces;


public class Pawn extends ChessPiece {

    public Pawn(ChessBoard board, int x, int y, ChessSprite.Color color){
        super(board, color == Color.WHITE? "resources/Chess_plt60.png" : "resources/Chess_pdt60.png",
                "resources/Chess_pat60.png", x, y, color);
        }


    @Override
    public boolean canMoveTo(int x, int y) {
        int currentX = getBoardX();
        int currentY = getBoardY();

        if (getColor() == Color.WHITE) {
            int schritte = currentY-y;
            if (x == currentX) {
                if(currentY == 6 && (schritte == 1 || schritte == 2)) {
                    return true;
                }
                if(currentY != 6 && schritte == 1){
                    return true;
                }
            }
        }

        else {
            int schritte = y - currentY;
            if (x == currentX) {
                if(currentY == 1 && (schritte == 1 || schritte == 2)) {
                    return true;
                }
                if(currentY != 1 && schritte == 1){
                    return true;
                }
            }
        }
        return false;
    }
}
