/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoc_ghidulieu;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Student implements Serializable{
    private String Name;
    private double mark;
    private String major;

    public Student() {
    }

    public Student(String Name, double mark, String major) {
        this.Name = Name;
        this.mark = mark;
        this.major = major;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    
}
