/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai12;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            Product ds = new Product();
//            ds.input();;
//            ds.output();
//        }
        Scanner sc = new Scanner(System.in);
        int chon = 1;
        ProductDao Dao = new ProductDao();
        do {

            System.out.println("1.Thêm product");
            System.out.println("2.Cập nhật product");
            System.out.println("3.Xóa product");
            System.out.println("4.select all product");
            System.out.println("Mời chọn: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    Product p = new Product();
                    p.input();
                    Dao.insert(p);
                    break;
                case 2:
                    p = new Product();
                    p.input();
                    Dao.update(p);
                    break;
                case 3:
                    System.out.println("Name xóa: ");
                    String nameD=sc.nextLine();
                    Dao.delete(nameD);
                    break;
                case 4:
                    Dao.select();
                    break;
            }

        } while (true);

    }
}
