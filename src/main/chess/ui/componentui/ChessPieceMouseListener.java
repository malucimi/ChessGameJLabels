package chess.ui.componentui;

import chess.pieces.ChessBoard;
import chess.pieces.ChessField;
import chess.pieces.ChessPiece;
import chess.pieces.ChessSprite;
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
            ChessSprite sprite = ((PieceLabel) c).getSprite();
            if(sprite instanceof ChessPiece){
                sprite.setHighlighted(true);
                ChessBoard board = panel.getBoard();
                ChessField[][] fields = board.getFields();
                for (int y = 0; y < fields.length; y++){
                    for (int x = 0; x < fields[y].length; x++){
                        if(((ChessPiece)sprite).canMoveTo(x, y)){
                            fields[y][x].setHighlighted(true);
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
            ChessSprite sprite = ((PieceLabel) c).getSprite();
            if(sprite instanceof ChessPiece){
                sprite.setHighlighted(false);
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
