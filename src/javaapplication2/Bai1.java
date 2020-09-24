/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;

public class Bai1 {
    public void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        int a = input.nextInt();
        System.out.println("Nhap so thu hai: ");
        int b = input.nextInt();
        System.out.println("Tong la: " + (a + b));
        System.out.println("Hieu la: " + (a - b));
        System.out.println("Tich la: " + (a * b));
        System.out.println("Thuong la: " + (double) (a / b));
        input.close();
    }
}
