///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.luyentaplad5;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.util.ArrayList;
//
///**
// *
// * @author Admin
// */
//public class RWOBject {
//    // Hàm ghi dữ liệu đối tượng
//    public void writeObject(String path,Object obj) throws FileNotFoundException, IOException{
//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(path));
//        oos.writeObject(obj);
//        oos.flush();
//        oos.close();
//    }
//    // Hàm đọc dữ liệu đối tượng
//    public ArrayList<Staff> readObject(String path) throws FileNotFoundException{
//        ArrayList<Staff> list=new ArrayList<>();
//        FileInputStream fis=new FileInputStream(path);
//        Staff ds=new Staff();
//        ObjectOutputStream ois;
//        
//    }
//}
