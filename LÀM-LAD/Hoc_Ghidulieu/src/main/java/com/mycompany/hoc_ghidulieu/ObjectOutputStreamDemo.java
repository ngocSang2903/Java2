/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoc_ghidulieu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ObjectOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("Sangvip.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

//            Student[] starr={new Student("Ngọc sáng",9.0,"UDPM"),new Student("Ngọc Tú",6.0,"MKT"),new Student("Phanh",9.9,"UDPM")};
            ArrayList<Student> list = new ArrayList<>();
            list.add(new Student("Ngọc sáng", 9.0, "UDPM"));
            list.add(new Student("Ngọc Tú", 6.0, "MKT"));
            list.add(new Student("Ngọc sáng", 9.0, "UDPM"));
            oos.writeObject(list);
            oos.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObjectOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
