/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baikiemtra78;

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
    
    public void run(){
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss aa");
        while (true) {            
            Date now=new Date();
            String dh=sdf.format(now);
            dongho.setText(dh);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(dongho.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
