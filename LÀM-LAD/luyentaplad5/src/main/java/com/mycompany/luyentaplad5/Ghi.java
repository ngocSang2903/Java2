/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luyentaplad5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Ghi {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream ghi=new FileOutputStream("D:/JAVA2/testlad5/phanghi.dat");
        
        String chuoi="Anh sang dep trai";
        byte[] a=chuoi.getBytes();
        ghi.write(a);
    }
}
