/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2_lad1;

/**
 *
 * @author Admin
 */
public class Fish extends Animal implements Pet {

    private String name = "fist";

    public Fish() {
        super(0);
    }

    public Fish(int legs) {
        super(legs);
    }

    @Override
    public String getName() {
        System.out.println("getName");
        return null;
    }

    @Override
    public String setName(String Name) {
        System.out.println("setName");
        return null;
    }

    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    public void walk() {
        System.out.println("Cá không thể đi và không có chân");
    }

    public static void main(String[] args) {
        Fish fish = new Fish();
        System.out.println("Tên fish là: " + fish.name);
        fish.walk();
    }
}
