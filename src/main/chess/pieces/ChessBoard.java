package chess.pieces;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
    private List<ChessPiece> pieces = new ArrayList<>(); //TODO
    private ChessField[][] fields = new ChessField[8][8];

    public ChessBoard() {
        setupBoard();
    }

    private void setupBoard() {
        for(int i=0; i<8; i++) {
            for (int j=0; j<8; j++) {
                fields[i][j] = new ChessField(i, j, ((i+j)%2==0)?ChessSprite.Color.WHITE: ChessSprite.Color.BLACK);
            }
        }
        for(int i=0; i<8; i++) {
            pieces.add(new Pawn(this, i, 1, ChessPiece.Color.BLACK));
            pieces.add(new Pawn(this, i, 6, ChessPiece.Color.WHITE));
        }
    }

    public void highlight(int x, int y) {
        getFields()[x][y].setHighlighted(true);
    } // TODO

    public void unhighlightAll() {
        for(int i=0; i<8; i++) {
            for (int j = 0; j < 8; j++) {
                getFields()[i][j].setHighlighted(false);
            }
        }
    }

    public ChessField[][] getFields() {
        return fields;
    }

    public List<ChessPiece> getPieces() {
        return pieces;
    }
}
