/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2_lad1;

/**
 *
 * @author Admin
 */
abstract public class Animal {
    protected int legs;

    public Animal(int legs) {
        this.legs = legs;
    }
   abstract public void eat();
    public void walk(){
        System.out.println("Con vật có số chân là: "+legs);
    }
}
