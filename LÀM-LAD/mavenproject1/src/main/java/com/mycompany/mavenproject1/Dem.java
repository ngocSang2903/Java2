/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Admin
 */
public class Dem {

    public static void main(String[] args) {
        try {
            sang s = new sang();
            s.start();
            s.join();
            sang s1 = new sang();
            s1.start();
            s1.join();
            sang s2 = new sang();
            s2.start();
        } catch (Exception e) {
        }
    }
}
