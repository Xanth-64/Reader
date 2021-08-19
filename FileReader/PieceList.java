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
public class PieceList {
    private PieceNode first;
    private PieceNode last;
    private int size;

    public PieceList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public void insertAtTheEnd(PieceNode nodeToInsert){
        if(isEmpty()){
            this.first = nodeToInsert;
            this.last = nodeToInsert;
            this.size = 1;
            return;
        }
        this.last.setNext(nodeToInsert);
        this.last = nodeToInsert;
        this.size++;        
    }

    public PieceNode getFirst() {
        return first;
    }

    public void setFirst(PieceNode first) {
        this.first = first;
    }

    public PieceNode getLast() {
        return last;
    }

    public void setLast(PieceNode last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
}
