package chess.ui.componentui;

import chess.ui.GamePanel;
import chess.pieces.ChessField;
import chess.pieces.ChessPiece;

import java.util.ArrayList;

public class ComponentsGamePanel extends GamePanel {
    private ArrayList<PieceLabel> labels = new ArrayList<>();

    public ComponentsGamePanel(int fieldSize) {
        super(fieldSize);
        setLayout(null);
        ChessPieceMouseListener listener = new ChessPieceMouseListener(this);
        for(ChessPiece p : getBoard().getPieces()) { // TODO
            PieceLabel pieceLabel = new PieceLabel(p);
            pieceLabel.setBounds(p.getBoardX()*fieldSize, p.getBoardY()*fieldSize,
                    fieldSize, fieldSize);
            pieceLabel.addMouseListener(listener);
            labels.add(pieceLabel);
            add(pieceLabel);
        }
        for(ChessField[] row : getBoard().getFields()) {
            for(ChessField f : row) {
                PieceLabel l = new PieceLabel(f);
                l.setBounds(f.getBoardX()*fieldSize, f.getBoardY()*fieldSize,
                        fieldSize, fieldSize);
                add(l);
                labels.add(l);
            }
        }
    }

    @Override
    public void updateGUI() { // TODO
       for(PieceLabel l : labels) {
           l.updateIcon();
       }
       repaint();
    }

}
