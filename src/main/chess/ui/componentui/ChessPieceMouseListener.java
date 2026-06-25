package chess.ui.componentui;

import chess.pieces.ChessPiece;
import chess.ui.GamePanel;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ChessPieceMouseListener implements MouseListener {

    private GamePanel panel;

    public ChessPieceMouseListener(GamePanel panel){
        this.panel = panel;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Component c = e.getComponent();

        if (c instanceof PieceLabel){
            PieceLabel pl = (PieceLabel)c;
            if(pl.getSprite() instanceof ChessPiece){
                ChessPiece cp = (ChessPiece)pl.getSprite();
                cp.setHighlighted(true);

                for (int y = 0; y < 8; y++){
                    for (int x = 0; x < 8; x++){
                        if(cp.canMoveTo(x, y)){
                            panel.getBoard().highlight(x, y);
                        }
                    }
                }
            }
        }
        panel.updateGUI();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Component c = e.getComponent();
        if (c instanceof PieceLabel){
            PieceLabel pl = (PieceLabel)c;
            if(pl.getSprite() instanceof ChessPiece){
                ChessPiece cp = (ChessPiece)pl.getSprite();
                cp.setHighlighted(false);
                panel.getBoard().unhighlightAll();
            }
        }
        panel.updateGUI();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }


}
