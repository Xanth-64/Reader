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
public class StorageList {
    private StorageNode first;
    private StorageNode last;
    private int size;
    
    public StorageList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    
    public String printData(){
        String texto;
        texto = "Almacenes;\n";
        
        if(!isEmpty()){
            StorageNode aux;
            aux = first;
            while (aux!= null){
                texto = texto + aux.getStorageName() + ":\n";
                if(!aux.getStoragePieces().isEmpty()){
                    PieceNode aux2;
                    aux2 = aux.getStoragePieces().getFirst();
                    while (aux2 != null){
                        texto = texto + aux2.getPieceName() + "," + Integer.toString(aux2.getPieceQuant());
                        if(aux2 == aux.getStoragePieces().getLast()){
                            texto = texto + ";";
                        }
                        texto = texto + "\n";
                        aux2 = aux2.getNext();
                    }
                }
                aux = aux.getNext();
            }
        }
        return texto;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public void insertAtTheEnd(StorageNode nodeToInsert){
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

    public StorageNode getFirst() {
        return first;
    }

    public void setFirst(StorageNode first) {
        this.first = first;
    }

    public StorageNode getLast() {
        return last;
    }

    public void setLast(StorageNode last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
}
