/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baikiemtra;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Dienthoai implements Serializable {
    private String ten;
    private double gia;
    private String thuonghieu;
    private boolean conhang;

    public Dienthoai() {
    }

    public Dienthoai(String ten, double gia, String thuonghieu, boolean conhang) {
        this.ten = ten;
        this.gia = gia;
        this.thuonghieu = thuonghieu;
        this.conhang = conhang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getThuonghieu() {
        return thuonghieu;
    }

    public void setThuonghieu(String thuonghieu) {
        this.thuonghieu = thuonghieu;
    }

    public boolean isConhang() {
        return conhang;
    }

    public void setConhang(boolean conhang) {
        this.conhang = conhang;
    }
    
    
}
