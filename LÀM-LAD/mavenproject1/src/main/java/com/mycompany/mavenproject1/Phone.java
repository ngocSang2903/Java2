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
public class Phone {

    int Cmoney = 20000;

    public synchronized void payCard(int money) {
        System.out.println("Bạn đang mua thẻ cào mệnh giá " + money);
        if (Cmoney < money) {
            System.out.println("Hãy nạp thêm tiền");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Phone.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (Cmoney > money) {
            Cmoney = Cmoney - money;
            System.out.println("Nạp tiền thành công");
        }
    }

    public synchronized void deposit(int money) {
        System.out.println("Bạn đang nạp " + money);
        Cmoney = Cmoney + money;
        System.out.println("Nạp tiền thành công");
    }
}
