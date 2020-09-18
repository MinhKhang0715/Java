/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;

public class Bai5 {
    public void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap 1 so: ");
        int n = input.nextInt();
        if (n == 0) {
            System.out.println(n + " la so zero");
        } else if (n < 0) {
            System.out.println(n + " la so am");
        } else if (n > 0) {
            System.out.println(n + " la so duong");
        }
    }
}
