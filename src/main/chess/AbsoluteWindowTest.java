package chess;

import chess.pieces.ChessField;
import chess.pieces.ChessSprite;
import chess.ui.componentui.PieceLabel;

import javax.swing.*;
import java.awt.*;

public class AbsoluteWindowTest extends JFrame {
    private class AbsolutePanel extends JPanel {
        public AbsolutePanel() {
            setLayout(null);
            setSize(new Dimension(8*60, 8*60));
            ChessField testField = new ChessField(0, 0, ChessSprite.Color.BLACK);
            PieceLabel testLabel = new PieceLabel(testField);
            testLabel.setBounds(0, 0, 60, 60);
            add(testLabel);
            testField = new ChessField(0, 0, ChessSprite.Color.WHITE);
            testLabel = new PieceLabel(testField);
            testLabel.setBounds(60, 0, 60, 60);
            add(testLabel);
            testField = new ChessField(0, 0, ChessSprite.Color.BLACK);
            testLabel = new PieceLabel(testField);
            testLabel.setBounds(120, 0, 60, 60);
            add(testLabel);
            testField = new ChessField(0, 0, ChessSprite.Color.WHITE);
            testLabel = new PieceLabel(testField);
            testLabel.setBounds(0, 60, 60, 60);
            add(testLabel);
            testField = new ChessField(0, 0, ChessSprite.Color.BLACK);
            testLabel = new PieceLabel(testField);
            testLabel.setBounds(60, 60, 60, 60);
            add(testLabel);
            testField = new ChessField(0, 0, ChessSprite.Color.WHITE);
            testLabel = new PieceLabel(testField);
            testLabel.setBounds(120, 60, 60, 60);
            add(testLabel);
        }
    }
    public AbsoluteWindowTest() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(8*60, 8*60));
        add(new AbsolutePanel());
    }
    public static void main(String[] args) {
        new AbsoluteWindowTest().setVisible(true);
    }
}