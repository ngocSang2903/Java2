/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Bai12;

/**
 *
 * @author Admin
 */
public interface ITF_product {
    public int insert(Product p);
    public int update(Product p);
    public int delete(String name);
    public int findbyName(String name);
    public void select();
    
}
