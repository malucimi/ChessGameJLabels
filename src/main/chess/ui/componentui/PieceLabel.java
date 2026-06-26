package chess.ui.componentui;

import chess.pieces.ChessSprite;

import javax.swing.*;


public class PieceLabel extends JLabel {
    private ChessSprite sprite;

    public PieceLabel(ChessSprite sprite){
            this.sprite = sprite;
    }

    public ChessSprite getSprite(){
        return sprite;
    }

    public void updateIcon(){
        setIcon(sprite.getCurrentIcon());
    }
}
