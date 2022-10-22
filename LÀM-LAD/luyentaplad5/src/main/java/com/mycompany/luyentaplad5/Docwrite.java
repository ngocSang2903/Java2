/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luyentaplad5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Docwrite {
    public static void main(String args[]) throws IOException{
        docchar("D:/JAVA2/testlad5/phanghi1.dat");
    }
    public static void docchar(String path) throws FileNotFoundException, IOException{
         FileReader fr=new FileReader(path);
         BufferedReader br=new BufferedReader(fr);
         String text;
         while((text=br.readLine())!=null){
             System.out.println(text);
         }
    }
}
