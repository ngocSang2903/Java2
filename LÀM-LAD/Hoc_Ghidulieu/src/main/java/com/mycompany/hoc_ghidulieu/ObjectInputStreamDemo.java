/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoc_ghidulieu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ObjectInputStreamDemo {

    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fis = new FileInputStream("Sangvip.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
            for (Student student : list) {
                System.out.println("Student: " + student.getName() + " " + student.getMark() + " " + student.getMajor());
            }
//            System.out.println("Dọc FIle: ");
//            Student[] students=(Student[])ois.readObject();
//            
//            for (Student student : students) {
//                System.out.println("Student: "+student.getName()+" "+student.getMark()+" "+student.getMajor());
//            }
            fis.close();
            ois.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObjectInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ObjectInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
