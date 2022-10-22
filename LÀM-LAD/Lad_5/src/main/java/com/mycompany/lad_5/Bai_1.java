/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lad_5;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Bai_1 {
    public static void main(String[] args) {
        try {
            String path="D:/JAVA2/testlad5/hello";
            Xfile.write(path,"Helo bee".getBytes());
            
            byte[] data=Xfile.read(path);
            System.out.println("Đọc data: "+new String(data));
        } catch (IOException ex) {
            System.out.println("Lỗi"+ex.getMessage());
        }
    }
}
