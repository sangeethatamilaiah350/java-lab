/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author SANGEETHA
 */
public class ByteStreamForb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileInputStream fis=new FileInputStream("G:\\lab10\\src\\main\\java\\filehandling\\speec.mp3");
        FileOutputStream fos=new FileOutputStream("G:\\lab10\\src\\main\\java\\filehandling\\Speech.mp3");
        int read;
        while((read=fis.read())!=-1){
            fos.write(read);
            System.out.println(read);
        }
        
    }
    
}
