/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lad_3;

/**
 *
 * @author Admin
 */
public class Student {
     String hovaten;
     Double diem;
     String chuyennganh;

    public Student() {
    }

    public Student(String hovaten, Double diem, String chuyennganh) {
        this.hovaten = hovaten;
        this.diem = diem;
        this.chuyennganh = chuyennganh;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    public String getChuyennganh() {
        return chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        this.chuyennganh = chuyennganh;
    }
    

    
    
    public String getGrade(){
        if(this.diem<3){
            return "Kém";
        }
        if(this.diem<5){
            return "Yếu";
        }
        if(this.diem<6.5){
            return "Trung bình";
        }
        if(this.diem<7.5){
            return "Khá";
        }
        if(this.diem<9){
            return "Giỏi";
        }
        return "Xuất sắc";
    }
    public boolean isBunus(){
        return this.diem>=7.5;
    }
    
}
