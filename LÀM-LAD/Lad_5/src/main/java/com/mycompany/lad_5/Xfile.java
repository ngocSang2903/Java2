/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lad_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;

/**
 *
 * @author Admin
 */
public class Xfile {

    public static Object readObject(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
        try (FileInputStream sang1 = new FileInputStream(path);
                ObjectInputStream sang2 = new ObjectInputStream(sang1);) {
            return sang2.readObject();
        }
    }

    public static void WriteObject(String path, Object data) throws IOException {
        try (FileOutputStream sang1 = new FileOutputStream(path);
                ObjectOutputStream sang2 = new ObjectOutputStream(sang1)) {
            sang2.writeObject(data);
        }
    }

    public static byte[] read(String path) throws FileNotFoundException, IOException {
        try (FileInputStream sang = new FileInputStream(path);) {
            int length = sang.available();
            byte[] buffer = new byte[length];
            sang.read(buffer);
            return buffer;
        }
//        "D:/JAVA2/testlad5/hello"
    }

    public static void write(String path, byte[] data) throws FileNotFoundException, IOException {
        try (FileOutputStream sang = new FileOutputStream(path);) {
            sang.write(data);
        }
    }
}
