package chess.pieces;

public abstract class ChessPiece extends ChessSprite{
    private Color color;
    private ChessBoard board;

    public ChessPiece(ChessBoard board, String imagefile, String mouseOverImageFile, int x, int y, Color color){
        super(imagefile, mouseOverImageFile, x, y);
        this.board = board;
        this.color = color;

    }
    public Color getColor(){
        return color;
    }

    public abstract boolean canMoveTo(int x, int y);

}
