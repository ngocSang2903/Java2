/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lad_2;

/**
 *
 * @author Admin
 */
public class Student {
    private String Studentnum;
    private String StudentName;
    private String Gender;
    private int YOD;
    private String ClassName;
    private int Finnal;
    private String Notes;
    private Boolean status;

    public Student() {
    }

    public Student(String Studentnum, String StudentName, String Gender, int YOD, String ClassName, int Finnal, String Notes, Boolean status) {
        this.Studentnum = Studentnum;
        this.StudentName = StudentName;
        this.Gender = Gender;
        this.YOD = YOD;
        this.ClassName = ClassName;
        this.Finnal = Finnal;
        this.Notes = Notes;
        this.status = status;
    }

    public String getStudentnum() {
        return Studentnum;
    }

    public void setStudentnum(String Studentnum) {
        this.Studentnum = Studentnum;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getYOD() {
        return YOD;
    }

    public void setYOD(int YOD) {
        this.YOD = YOD;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public int getFinnal() {
        return Finnal;
    }

    public void setFinnal(int Finnal) {
        this.Finnal = Finnal;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
