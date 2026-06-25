package chess.pieces;

public class ChessField extends ChessSprite{

    public ChessField(int x, int y, ChessSprite.Color color){
               super(color == Color.WHITE? "resources/Chess_flt60.png" : "resources/Chess_fdt60.png",
                       "resources/Chess_fat60.png", x, y);
    }
}
