/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoc_ghidulieu;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DataInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("dataout.dat");
            DataInputStream dis=new DataInputStream(fis);
            String name=dis.readUTF();
            char txt=dis.readChar();
            Double mark=dis.readDouble();
            
            System.out.println("Name:  "+name);
            System.out.println("txt:  "+txt);
            System.out.println("mark:  "+mark);
            dis.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
