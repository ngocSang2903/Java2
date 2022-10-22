/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formdayny;

import java.io.Serializable;
import javax.sound.sampled.BooleanControl;

/**
 *
 * @author Admin
 */
public class Student implements Serializable{
    private String masv;
    private String ten;
    private int tuoi;
    private String gioitinh;
    private String diachi;
    private boolean tinhtrang;

    public Student() {
    }

    public Student(String masv, String ten, int tuoi, String gioitinh, String diachi, boolean tinhtrang) {
        this.masv = masv;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.tinhtrang = tinhtrang;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
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

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public boolean isTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(boolean tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
    
}
