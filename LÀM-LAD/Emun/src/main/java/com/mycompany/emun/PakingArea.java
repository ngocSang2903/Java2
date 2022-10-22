/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.emun;

/**
 *
 * @author Admin
 */
public enum PakingArea {
    MOTOBIKE(5000),SEDAN(30000),SUV(35000);    
    private int money;
    
    private PakingArea() {
    }

    private PakingArea(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
}
