/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baikiemtralad3;

/**
 *
 * @author Admin
 */
public class Sinhvien {

    private String ten;
    private double diem;
    private String nganh;

    public Sinhvien() {
    }

    public Sinhvien(String ten, double diem, String nganh) {
        this.ten = ten;
        this.diem = diem;
        this.nganh = nganh;
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

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String hocluc() {
        if (this.diem < 3) {
            return "Kém";
        }
        if (this.diem < 5) {
            return "Yếu";
        }
        if (this.diem < 6.5) {
            return "Trung bình";
        }
        if (this.diem < 7.5) {
            return "Khá";
        }
        if (this.diem < 9) {
            return "Giỏi";
        }
        return "Xuất sắc";
    }
}

