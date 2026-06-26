package chess.ui.componentui;

import chess.pieces.ChessField;
import chess.pieces.ChessPiece;
import chess.ui.GamePanel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ComponentsGamePanel extends GamePanel {
    private ArrayList<PieceLabel> labels;

    public ComponentsGamePanel(int fieldSize){
        super(fieldSize);

        setLayout(null);
        List<ChessPiece> pieces = getBoard().getPieces();
        ChessField[][] fields = getBoard().getFields();
        labels = new ArrayList<>();

        for(ChessPiece piece : pieces){
            PieceLabel label = new PieceLabel(piece);
            label.updateIcon();
            label.setBounds(piece.getBoardX()*fieldSize, piece.getBoardY()*fieldSize, fieldSize, fieldSize);
            label.addMouseListener(new ChessPieceMouseListener(this));
            add(label);
            labels.add(label);
        }

        for(int y= 0; y < 8; y++){
            for(int x = 0; x < 8; x++){
                PieceLabel label = new PieceLabel(fields[y][x]);
                label.updateIcon();
                label.setBounds(x*fieldSize, y*fieldSize, fieldSize, fieldSize);
                add(label);
                labels.add(label);
            }
        }
    }

    @Override
    public void updateGUI() {
        for(PieceLabel l : labels) {
            l.updateIcon();
        }
        repaint();
    }
}
