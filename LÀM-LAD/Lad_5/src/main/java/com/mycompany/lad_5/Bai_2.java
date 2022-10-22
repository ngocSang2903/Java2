/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lad_5;

/**
 *
 * @author Admin
 */
public class Bai_2 {
    public static void main(String[] args) {
        try {
            Student ds=new Student("NSang",4,"PRogram");
            String path="D:/JAVA2/testlad5/hello1";
            Xfile.WriteObject(path, ds);
            
            Student std=(Student) Xfile.readObject(path);
            System.out.println("Name:"+std.getName());
            System.out.println("Marks:"+std.getMarks());
            System.out.println("Major:"+std.getMajor());
            System.out.println("Grade:"+std.getGrare());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
