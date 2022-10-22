/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

import com.sun.source.doctree.SerialDataTree;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Nhanvien implements Serializable{
    String manhanvien;
    String hovaten;
    int tuoi;
    String email;
    Double luong;

    public Nhanvien() {
    }

    public Nhanvien(String manhanvien, String hovaten, int tuoi, String email, Double luong) {
        this.manhanvien = manhanvien;
        this.hovaten = hovaten;
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

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
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

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    
}
