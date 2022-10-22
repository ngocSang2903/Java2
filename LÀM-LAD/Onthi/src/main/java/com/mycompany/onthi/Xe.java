/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onthi;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Xe implements Serializable {
    private String ten;
    private String loai;
    private int gianhap;
    private String hangxe;

    public Xe() {
    }

    public Xe(String ten, String loai, int gianhap, String hangxe) {
        this.ten = ten;
        this.loai = loai;
        this.gianhap = gianhap;
        this.hangxe = hangxe;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getGianhap() {
        return gianhap;
    }

    public void setGianhap(int gianhap) {
        this.gianhap = gianhap;
    }

    public String getHangxe() {
        return hangxe;
    }

    public void setHangxe(String hangxe) {
        this.hangxe = hangxe;
    }
    
    
}
