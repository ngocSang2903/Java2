/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_gd1;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Nhanvien implements Serializable {
    private String manhanvien;
    private String ten;
    private int tuoi;
    private String email;
    private double luong;

    public Nhanvien() {
    }

    public Nhanvien(String manhanvien, String ten, int tuoi, String email, double luong) {
        this.manhanvien = manhanvien;
        this.ten = ten;
        this.tuoi = tuoi;
        this.email = email;
        this.luong = luong;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    
}
