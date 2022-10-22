/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Admin
 */
public class MainPhone extends Thread {

    public static void main(String[] args) {
        Phone p = new Phone();
        Thread t = new Thread() {
            public void run() {
                p.payCard(10000);
            }
        };
        t.start();
        
        Thread t2 = new Thread() {
            public void run() {
                p.deposit(14000);
            }
        };
        t2.start();
        
    }
}
