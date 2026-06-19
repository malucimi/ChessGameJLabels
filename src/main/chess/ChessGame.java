package chess;

import chess.ui.componentui.ComponentsGamePanel;

import javax.swing.*;
import java.awt.*;

public class ChessGame extends JFrame {
    public ChessGame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ComponentsGamePanel panel = new ComponentsGamePanel(60);
        panel.setPreferredSize(new Dimension(60 * 8, 60 * 8));

        add(panel);
        pack();
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new ChessGame().setVisible(true);
    }
}