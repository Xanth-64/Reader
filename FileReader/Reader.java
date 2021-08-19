/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReader;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Xanth
 */
public class Reader {

    private String filePath;

    public Reader(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void readFile(StorageList storage) {
        File file = new File(filePath);

        try {
            FileReader fileReader;
            fileReader = new FileReader(file);
            BufferedReader wrapper;
            wrapper = new BufferedReader(fileReader);

            String lineFeed;

            try {
                int readMode = 0;
                StorageNode currentStorage = null;
                PieceNode currentPiece = null;
                while ((lineFeed = wrapper.readLine()) != null) {
                    //Aqui va la logica de la lectura del TXT
                    if (lineFeed.equals("Almacenes;")) {
                        readMode = 1;

                    } else if (lineFeed.equals("Rutas;")) {
                        readMode = 2;

                    } else {
                        if (readMode == 1) {
                            if(lineFeed.endsWith(":")){
                                if(currentStorage != null){
                                    storage.insertAtTheEnd(currentStorage);
                                }
                                currentStorage = new StorageNode(lineFeed.split(":")[0]);
                            }
                            else{
                             
                                currentPiece = new PieceNode(lineFeed.replaceAll(";", "").split(",")[0],Integer.parseInt(lineFeed.replaceAll(";", "").split(",")[1]));
                                currentStorage.getStoragePieces().insertAtTheEnd(currentPiece);
                            }
                        } else if (readMode == 2) {

                        } else {
                            //Error Handling porque el Txt está dañado
                        }
                    }

                }
            } catch (IOException ex) {
                Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
