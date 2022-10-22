/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luyentaplad5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Ghiwrite {
    public static void main(String args[]) throws IOException{
        ghichar("D:/JAVA2/testlad5/phanghi1.dat");
    }
    public static void ghichar(String path) throws IOException{
        FileWriter fw=new FileWriter(path);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Ghi cai lon gi o");
        bw.flush();
        bw.close();
    }
}
