package chess.ui.componentui;

import chess.pieces.ChessBoard;
import chess.pieces.ChessField;
import chess.pieces.ChessSprite;
import chess.ui.GamePanel;

import javax.swing.*;
import java.util.ArrayList;

public class ComponentsGamePanel extends GamePanel {
    private ArrayList<PieceLabel> labels;

    public ComponentsGamePanel(int fieldSize){
        super(fieldSize);
        setLayout(null);
        ChessField[][] fields = getBoard().getFields();
        labels = new ArrayList<>();

        for(int zeile= 0; zeile<fields.length; zeile++){
            for(int spalte = 0; spalte<fields[zeile].length; spalte++){
                PieceLabel label = new PieceLabel(fields[zeile][spalte]);
                label.setBounds(spalte*60, zeile*60, 60, 60);
                add(label);
                labels.add(label);
            }

        }

    }



    @Override
    public void updateGUI() {

    }
}
