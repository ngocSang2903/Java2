/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formdayny;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class dongho extends Thread{
    private JLabel dongho;

    public dongho(JLabel dongho) {
        this.dongho = dongho;
    }
    
    @Override
    public void run(){
        SimpleDateFormat dongh=new SimpleDateFormat("hh:mm:ss aa");
        do {
            Date sc=new Date();
            String dh=dongh.format(sc);
            dongho.setText(dh);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(dongho.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);
        
    }
}
