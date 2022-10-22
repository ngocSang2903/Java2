/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_gd1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class Dongho extends Thread{
    private JLabel dongho;

    public Dongho(JLabel dongho) {
        this.dongho = dongho;
    }
    @Override
    public void run(){
          SimpleDateFormat dh=new SimpleDateFormat("hh:mm:ss  aa");
          while (true) {            
            Date now=new Date();
            String dd=dh.format(now);
            dongho.setText(dd);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException ex) {
                  Logger.getLogger(Dongho.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
    }
}
