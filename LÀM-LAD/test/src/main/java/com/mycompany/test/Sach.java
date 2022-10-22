/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Sach implements Serializable{
    private  String ten;
    private String theloai;
    private int gia;

    public Sach() {
    }

    public Sach(String ten, String theloai, int gia) {
        this.ten = ten;
        this.theloai = theloai;
        this.gia = gia;
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

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    public String getStatus(){
        if(gia>5000){
            return "Đắt quá";
        }
        else{
            return "Bình thường";
        }
    }
}
