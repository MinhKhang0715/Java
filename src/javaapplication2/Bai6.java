/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;

public class Bai6 {
    public void run(){
        PrimeNumber check = new PrimeNumber();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = input.nextInt();
        if (check.checkPrime(n)) {
            System.out.println(n + " la so nguyen to");
        }
        else {
            System.out.println(n + " khong la so nguyen to");
        }
        input.close();
    }
}
