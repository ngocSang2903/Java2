/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class sang extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+ i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(sang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
