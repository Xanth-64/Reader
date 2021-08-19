/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReader;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Xanth
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFileChooser picker = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Choose a Txt File","txt");
        picker.setFileFilter(filter);
        int fileOption = picker.showOpenDialog(null);
        if(fileOption == JFileChooser.APPROVE_OPTION){
            Reader readerVariable = new Reader(picker.getSelectedFile().getPath());
            StorageList storage = new StorageList();
            readerVariable.readFile(storage);
            System.out.println(storage.printData());
        }
    }
    
}
