/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoc_ghidulieu;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class FileWriterDemo {
    public static void main(String[] args) {    
        try {
            File f=new File("aaa.dat");
            FileWriter fw=new FileWriter(f);
            
            fw.write("Anh sáng đẹp trai bố đời hihi");
            fw.close();
            
            //doc
            FileReader fr=new FileReader("aaa.dat");
            System.out.println("Đọc ra:  ");
            int doc=fr.read();
            while (doc !=-1) {                
                System.out.print((char)doc);
                doc=fr.read();
            }
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(FileWriterDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
