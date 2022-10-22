/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emun;

/**
 *
 * @author Admin
 */
public class Summoney {
    public static void main(String[] args) {
        //láy ra giá trị của các hằng số
        PakingArea[] parkings=PakingArea.values();
        System.out.println(parkings);
        
        //lấy giá trị hằng số dựa vào key của hằng số đấy
        //PakingArea v1=PakingArea.MOTOBIKE;
        
        PakingArea v1=PakingArea.valueOf("MOTOBIKE");
        
        System.out.println(v1);
        int money=v1.getMoney();
        System.out.println(money);
        System.out.println("Vị trí hằng số:  "+v1.ordinal());
        System.out.println("so sánh các vị trí các hằng số với nhau : "+v1.compareTo(PakingArea.SUV));
    }
}
