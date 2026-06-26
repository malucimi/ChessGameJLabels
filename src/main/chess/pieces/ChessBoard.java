package chess.pieces;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
    //alle Schachfelder
    private ChessField[][] fields = new ChessField[8][8];
    //alle Schachfiguren
    private List<ChessPiece> pieces = new ArrayList<ChessPiece>();

    public ChessBoard() {
        setupBoard();
    }

    private void setupBoard() {
        //Zeile in fields ist y-Wert des Feldes, Spalte ist x-Wert
        for (int y = 0; y < 8; y++) {
            if (y % 2 == 0) {
                for (int x = 0; x < 8; x++) {
                    if (x % 2 == 0) {
                        fields[y][x] = new ChessField(x, y, ChessSprite.Color.BLACK);
                    } else {
                        fields[y][x] = new ChessField(x, y, ChessSprite.Color.WHITE);
                    }
                }
            }
            else {
                for (int x = 0; x < 8; x++) {
                    if (x % 2 == 0) {
                        fields[y][x] = new ChessField(x, y, ChessSprite.Color.WHITE);
                    } else {
                        fields[y][x] = new ChessField(x, y, ChessSprite.Color.BLACK);
                    }
                }
            }
        }
        //Startaufstellung der Bauern
        for (int x=0; x<8; x++){
            pieces.add(new Pawn(this, x,1, ChessSprite.Color.BLACK));
            pieces.add(new Pawn(this, x,6, ChessSprite.Color.WHITE));
        }
    }

    public void highlight(int x, int y) {
        fields[y][x].setHighlighted(true);
    }

    public void unhighlightAll() {
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                fields[y][x].setHighlighted(false);
            }
        }
    }

    public ChessField[][] getFields() {
        return fields;
    }

    public List<ChessPiece> getPieces(){
        return pieces;
    }
}