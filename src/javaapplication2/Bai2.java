/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;

public class Bai2 {
    public void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        int dai = input.nextInt();
        System.out.println("Nhap chieu rong: ");
        int rong = input.nextInt();
        System.out.println("Chu vi la: " + (dai + rong) * 2);
        System.out.println("Dien tich la: " + (dai * rong));
    }
}
