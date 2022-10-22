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
public class Sinhvien implements Serializable {
    private String Nganh;
    private String ma;
    private String ten;
    public double diem;

    public Sinhvien() {
    }

    public Sinhvien(String Nganh, String ma, String ten, double diem) {
        this.Nganh = Nganh;
        this.ma = ma;
        this.ten = ten;
        this.diem = diem;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    
}
