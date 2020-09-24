/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;

public class Bai7 {
    public void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = input.nextInt();
        System.out.println("Cau a: ");
        cau_a(n);
        
        System.out.println("Cau b: ");
        cau_b(n);
        
        System.out.println("Cau c: ");
        cau_c(n);
        
        System.out.println("Cau d: ");
        cau_d(n);
        
        System.out.println("Cau e: ");
        cau_e(n);
        input.close();
    }
    static void cau_a(int num){
        int tong = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
            tong += i;
        }

        System.out.println("Tong la: " + tong);
    }
    static void cau_b(int n){
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                tong += i;
            }
        }

        System.out.println("Tong la: " + tong);
    }
    static void cau_c(int n){
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                tong += i;
            }
        }

        System.out.println("Tong la: " + tong);
    }
    static void cau_d(int n){
        PrimeNumber check = new PrimeNumber();
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            if (check.checkPrime(i)) {
                System.out.println(i);
                tong += i;
            }
        }

        System.out.println("Tong la: " + tong);
    }
    static void cau_e(int n){
        PrimeNumber check = new PrimeNumber();
        int so = 1;
        int i = 0;
        while (so <= n) {
            i++;
            if (check.checkPrime(i)) {
                System.out.println(i);
                so++;
            }
        }
    }
}
