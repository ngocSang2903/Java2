/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baikiemtra78;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class ChieuP implements Serializable{
    private String ten;
    private String theloai;
    private int giave;
    private String hangphim;

    public ChieuP() {
    }

    public ChieuP(String ten, String theloai, int giave, String hangphim) {
        this.ten = ten;
        this.theloai = theloai;
        this.giave = giave;
        this.hangphim = hangphim;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public int getGiave() {
        return giave;
    }

    public void setGiave(int giave) {
        this.giave = giave;
    }

    public String getHangphim() {
        return hangphim;
    }

    public void setHangphim(String hangphim) {
        this.hangphim = hangphim;
    }
    
    
}
