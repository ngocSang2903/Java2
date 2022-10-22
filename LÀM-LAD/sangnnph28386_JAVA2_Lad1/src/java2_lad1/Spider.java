/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2_lad1;

/**
 *
 * @author Admin
 */
public class Spider extends Animal{
    
    public Spider(int legs) {
        super(legs);
    }

    public Spider() {
        super(9);
    }
    
    public void eat(){
        System.out.println("Spider cat Files");
    }
    
    public static void main(String[] args) {
        Spider nv=new Spider();
        System.out.println("so chan la: "+nv.legs);
        nv.eat();
    }
}
