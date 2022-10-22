/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lad_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Xdate {
    public static Date parse(String text)throws ParseException{
        SimpleDateFormat sang=new SimpleDateFormat("dd-MM-yyyy");
        return sang.parse(text);
    }
    public static Date parse(String text,String pattern)throws ParseException{
        SimpleDateFormat sang=new SimpleDateFormat(pattern);
        return sang.parse(text);
    }
}
