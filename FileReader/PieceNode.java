/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReader;

/**
 *
 * @author Xanth
 */
public class PieceNode {
    private String pieceName;
    private int pieceQuant;
    private PieceNode next;
    public PieceNode(String pieceName, int pieceQuant) {
        this.pieceName = pieceName;
        this.pieceQuant = pieceQuant;
        this.next = null;
    }

    public PieceNode getNext() {
        return next;
    }

    public void setNext(PieceNode next) {
        this.next = next;
    }

    public String getPieceName() {
        return pieceName;
    }

    public void setPieceName(String pieceName) {
        this.pieceName = pieceName;
    }

    public int getPieceQuant() {
        return pieceQuant;
    }

    public void setPieceQuant(int pieceQuant) {
        this.pieceQuant = pieceQuant;
    }
    
    
    
}
