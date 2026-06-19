package chess.pieces;

import javax.swing.*;

public abstract class ChessSprite {
    public enum Color {WHITE, BLACK}
    protected int boardX;
    protected int boardY;
    private boolean highlighted;
    private ImageIcon normalIcon;
    private ImageIcon highlightedIcon;

    public ChessSprite(String imagefile, String highlightedImageFile, int boardX, int boardY){
        this.normalIcon = new ImageIcon(imagefile);
        this.highlightedIcon = new ImageIcon(highlightedImageFile);
        this.boardX = boardX;
        this.boardY = boardY;
    }

    public int getBoardX() {
        return boardX;
    }

    public int getBoardY() {
        return boardY;
    }

    public boolean isHighlighted() {
        return highlighted;
    }

    public void setBoardX(int boardX) {
        this.boardX = boardX;
    }

    public void setBoardY(int boardY){
        this.boardY = boardY;
    }

    public void setHighlighted(boolean highlighted) {
        this.highlighted = highlighted;
    }

    public ImageIcon getNormalIcon() {
        return normalIcon;
    }

    public ImageIcon getHighlightedIcon() {
        return highlightedIcon;
    }

    public ImageIcon getCurrentIcon(){
        if (highlighted){
            return highlightedIcon;
        }
        else{
            return normalIcon;
        }

    }
}
