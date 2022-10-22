/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lad_6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Admin
 */
public class Bai2 extends Thread {
    private  JButton button;

    public Bai2(JButton button) {
        this.button = button;
    }
    

    @Override
    public void run() {
        SimpleDateFormat sdf =new SimpleDateFormat("hh:mm:ss aa");
        while (true) {            
            Date now=new Date();
            
            String st=sdf.format(now);
            button.setText(st);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
