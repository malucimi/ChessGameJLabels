package chess.pieces;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
    //Felder
    private ChessField[][] fields;
    //Schachfiguren
    private List<ChessPiece> pieces;

    public ChessBoard() {
        pieces = new ArrayList<ChessPiece>();
        fields = new ChessField[8][8];

        //Zeile ist y-Wert, Spalte ist x-Wert
        for (int y = 0; y < 8; y++) {
            if (y % 2 == 0) {
                for (int x = 0; x < 8; x++) {
                    if (x % 2 == 0) {

                        fields[y][x] = new ChessField(x, y, ChessSprite.Color.BLACK);
                    } else {
                        fields[y][x] = new ChessField(x, y, ChessSprite.Color.WHITE);
                    }
                }
            } else {
                for (int x = 0; x < 8; x++) {
                    if (x % 2 == 0) {
                        fields[y][x] = new ChessField(x, y, ChessSprite.Color.WHITE);
                    } else {
                        fields[y][x] = new ChessField(x, y, ChessSprite.Color.BLACK);
                    }
                }
            }
        }
        setupBoard();
    }

    public ChessField[][] getFields() {
        return fields;
    }

    private void setupBoard() {
        for (int x=0; x<8; x++){
            pieces.add(new Pawn(this, x,1, ChessSprite.Color.BLACK));
            pieces.add(new Pawn(this, x,6, ChessSprite.Color.WHITE));
        }
    }

    public void highlight(int x, int y) {
        fields[y][x].setHighlighted(true);
    }

    public void unhighlightAll() {
        for (int y = 0; y < fields.length; y++) {
            for (int x = 0; x < fields[y].length; x++) {
                fields[y][x].setHighlighted(false);
            }
        }
    }

    public List<ChessPiece> getPieces(){
        return pieces;
    }
}