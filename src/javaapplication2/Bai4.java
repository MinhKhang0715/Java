/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;

public class Bai4 {
    public void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap 1 so: ");
        int n = input.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " la so chan");
        } else {
            System.out.println(n + " la so le");
        }
        input.close();
    }
}
