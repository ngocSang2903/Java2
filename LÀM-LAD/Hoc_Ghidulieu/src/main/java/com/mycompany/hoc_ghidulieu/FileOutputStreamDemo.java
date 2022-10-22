/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoc_ghidulieu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class FileOutputStreamDemo {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("a.txt");
            String chuoi = "Anh sang dep trai";
            byte[] txtb = chuoi.getBytes();
            try {
                fos.write(txtb);
            } catch (IOException ex) {
                Logger.getLogger(FileOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
