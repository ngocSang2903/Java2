/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lad_6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class donghopart2 extends Thread{
    private JLabel dongho;

    public donghopart2(JLabel dongho) {
        this.dongho = dongho;
    }

    donghopart2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void run(){
        SimpleDateFormat sang=new SimpleDateFormat("hh:mm:ss aa");
        while(true){
            Date dt=new Date();
            String dh=sang.format(dt);
            dongho.setText(dh);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(donghopart2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
