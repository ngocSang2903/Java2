/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lad_2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class NewClass {

    public static void main(String[] args) {
//        Set<String> set = new HashSet<String>();
//        set.add("ph001");
//        set.add("ph002");
//        set.add("ph003");
//        
//        System.out.println("Dem : "+set.size());
//        set.remove("ph001");
//        System.out.println("Kiem tra co ph002"+set.contains("ph002"));
//        
//        Set<String> set1 = new HashSet<String>();
//        set1.add("ph001");
//        set1.add("ph0022");
//        set1.add("ph0033");
//        System.out.println("Dem : "+set1.toString());
//        System.out.println("Kiem tả phan tu set1 co trong set 2 khong"+set.containsAll(set1));
//        
        //Danh sách student
        ArrayList<Student> list=new ArrayList<>();
        
        Student nv=new Student();
        nv.setStudentnum("Ph0001");
        nv.setStudentName("Sáng ");
        nv.setGender("Nam");
        nv.setClassName("CP1710");
        nv.setFinnal(9);
        nv.setStatus(true);
        
        list.add(nv);
        
        for (int i = 0; i < list.size(); i++) {
            Student get = list.get(i);
            System.out.println(">> Student thu:  "+i+": "+get.getStudentnum());
        }
        for (Student student : list) {
            System.out.println(">> Student thu: "+student.getStudentnum()   );
        }
        
  
        
        ArrayList<Integer> ListInt=new ArrayList<>();
        ListInt.add(1);
        ListInt.add(5);
        ListInt.add(3);
        ListInt.add(9);
        ListInt.add(2);
        ListInt.add(1);
        ListInt.add(8);
        System.out.println("List:  "+ListInt.toString());
        
        Collections.sort(ListInt);
        System.out.println("List after  sort: "+ListInt.toString());
    }
}
