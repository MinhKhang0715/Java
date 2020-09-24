/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;

public class Management {
    public void runApp(){
        Bai1 b1 = new Bai1();
        Bai2 b2 = new Bai2();
        Bai3 b3 = new Bai3();
        Bai4 b4 = new Bai4();
        Bai5 b5 = new Bai5();
        Bai6 b6 = new Bai6();
        Bai7 b7 = new Bai7();
        Bai8 b8 = new Bai8();
        Bai9 b9 = new Bai9();
        Scanner choice = new Scanner(System.in);
        System.out.print("Bam 1 so n (1 <= n <= 9) de chon so bai: ");
        int n = choice.nextInt();
        switch(n){
            case 1: 
                b1.run();
                break;
            case 2: 
                b2.run();
                break;
            case 3: 
                b3.run();
                break;
            case 4:
                b4.run();
                break;
            case 5:
                b5.run();
                break;
            case 6:
                b6.run();
                break;
            case 7:
                b7.run();
                break;
            case 8:
                b8.run();
                break;
            case 9:
                b9.run();
                break;
            default:
                System.out.println("Nhap sai!");
        }
        choice.close();
    }
}
