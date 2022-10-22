/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2_lad1;

/**
 *
 * @author Admin
 */
public class Cat extends Animal implements Pet{

    private String name="cho";

    public Cat(String name, int legs) {
        super(4);
        this.name = name;
    }

    public Cat() {
        super(4);
    }
    
    
    public Cat(int legs) {
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
    
    public static void main(String[] args) {
        Cat cat=new Cat();
        System.out.println("Tên Cat: "+cat.name);
        System.out.println("Có số chân là: "+cat.legs);
        cat.getName();
        cat.setName("sang");
        cat.play();
        cat.eat();
    }
    
  
 
}
