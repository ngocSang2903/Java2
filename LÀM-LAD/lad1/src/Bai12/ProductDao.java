/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai12;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ProductDao implements ITF_product {

    ArrayList<Product> list = new ArrayList<>();

    @Override
    public int insert(Product p) {
        list.add(p);
        return 1;
    }

    @Override
    public int update(Product p) {
        int pos = findbyName(p.getName());
        if (pos < 0) {
            return -1;
        } else {
            list.set(pos, p);
        }
        return 1;
    }

    @Override
    public int delete(String name) {
        int pos = findbyName(name);
        if (pos < 0) {
            System.out.println("Không tìm thấy");
            return -1;
        } else {
            list.remove(pos);
        }
        return 1;
    }

    @Override
    public void select() {
        for(Product p:list){
            p.output();
        }
    }

    @Override
    public int findbyName(String name) {
        int pos = -1;
        for (int i = 0; i < list.size(); i++) {
            Product p = list.get(i);
            if (p.getName().equalsIgnoreCase(name)) {
                pos = i;
            }
        }
        return pos;
    }

}
