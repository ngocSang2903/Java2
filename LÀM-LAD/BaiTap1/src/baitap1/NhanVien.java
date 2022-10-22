/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String ten;
    private int tuoi;
    private float luong;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, float luong) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.luong = luong;
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

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tên: ");
        this.ten=sc.nextLine();
        System.out.println("Nhập tuổi: ");
        this.tuoi=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập lương: ");
        this. luong=Float.parseFloat(sc.nextLine());    
    }
    public void xuat(){
        System.out.println("tên: "+ten+"\n tuổi: "+tuoi+"\nlương: "+luong);
    }
}
