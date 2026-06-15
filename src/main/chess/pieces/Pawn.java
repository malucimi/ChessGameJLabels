package chess.pieces;

public class Pawn extends ChessPiece {
    public Pawn(ChessBoard board, int x, int y, ChessSprite.Color color) {
        super(board, "resources/Chess_p" + (color == Color.WHITE?"l":"d") + "t60.png", "resources/Chess_pat60.png", x, y, color);
    }

    @Override
    public boolean canMoveTo(int x, int y) {
        int direction = (getColor() == Color.BLACK)?1:-1;
        if(x == this.getBoardX()) {
            if(y == this.getBoardY()+direction || y == this.getBoardY()+2*direction) {
                return true;
            }
        }
        return false;
    }
}
