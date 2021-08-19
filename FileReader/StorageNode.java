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
public class StorageNode {
    private String StorageName;
    private PieceList StoragePieces;
    private StorageNode next;
    public StorageNode(String StorageName) {
        this.StorageName = StorageName;
        this.StoragePieces = new PieceList();
    }

    public String getStorageName() {
        return StorageName;
    }

    public void setStorageName(String StorageName) {
        this.StorageName = StorageName;
    }

    public PieceList getStoragePieces() {
        return StoragePieces;
    }

    public void setStoragePieces(PieceList StoragePieces) {
        this.StoragePieces = StoragePieces;
    }

    public StorageNode getNext() {
        return next;
    }

    public void setNext(StorageNode next) {
        this.next = next;
    }
    
    
    
}
