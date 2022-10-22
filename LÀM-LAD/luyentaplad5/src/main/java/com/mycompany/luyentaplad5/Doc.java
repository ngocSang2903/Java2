/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luyentaplad5;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Doc {
    public static void main(String[] args) throws IOException {
        FileInputStream phanh=new FileInputStream("D:/JAVA2/testlad5/phanghi.dat");
        int doc;
        while((doc=phanh.read())!=-1){
            System.out.print((char)doc);
        }
    }
}
