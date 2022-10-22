/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoc_ghidulieu;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DataOutputStreamDemo {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("dataout.dat");
            DataOutputStream dos = new DataOutputStream(fos);
            try {
                dos.writeUTF("Anh sang dep trai");
                dos.writeChars("Sieu nhan");
                dos.writeDouble(9.5);
                
            } catch (IOException ex) {
                Logger.getLogger(DataOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
