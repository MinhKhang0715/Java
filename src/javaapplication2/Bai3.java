/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;

public class Bai3 {
    public void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ban kinh r: ");
        int r = input.nextInt();
        System.out.println("Chu vi la: " + (2 * (double) r * Math.PI));
        System.out.println("Dien tich la: " + (double) (r * r) * Math.PI);
        input.close();
    }
}
