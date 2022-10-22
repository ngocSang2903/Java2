/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luyen;

/**
 *
 * @author Admin
 */
public class Staff {
    private String ID;
    private String Name;
    private String Gender;
    private String Country;
    private boolean Status;
    private String Notes;

    public Staff() {
    }

    public Staff(String ID, String Name, String Gender, String Country, boolean Status, String Notes) {
        this.ID = ID;
        this.Name = Name;
        this.Gender = Gender;
        this.Country = Country;
        this.Status = Status;
        this.Notes = Notes;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }
    
    
}
