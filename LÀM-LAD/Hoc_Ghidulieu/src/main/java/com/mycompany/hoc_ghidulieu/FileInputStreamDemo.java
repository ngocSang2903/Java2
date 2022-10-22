/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoc_ghidulieu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class FileInputStreamDemo {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
            int doc;       
            try {
                while ((doc = fis.read()) != -1) {
                    System.out.print((char) doc);
                }
            } catch (IOException ex) {
                Logger.getLogger(FileInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
