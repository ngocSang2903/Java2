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
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class dh extends Thread {

    private JLabel dongho;

    public dh(JLabel dongho) {
        this.dongho = dongho;
    }
    

   
    @Override
    public void run(){
        SimpleDateFormat df=new SimpleDateFormat("hh:mm:ss aa");
        while (true) {            
            Date now=new Date();
            String sc=df.format(now);
            dongho.setText(sc);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(dh.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
