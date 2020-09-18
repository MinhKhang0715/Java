/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;
public class Bai8 {
    public void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang: ");
        int n = input.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("arr[" + i + "]= ");
            arr[i] = input.nextInt();
        }
        
        cau_a(arr);
        cau_b(arr);
        cau_c(arr);
        cau_d(arr);
        cau_e(arr);
        cau_f(arr);
        cau_g(arr);
    }
    static void cau_a(int []arr){
        int quantity = arr.length;
        int sum = 0;
        System.out.println("Cac phan tu mang la: ");
        for (int i = 0; i < quantity; i++){
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println("Tong phan tu mang la: " + sum);
    }
    static void cau_b(int []arr){
        int quantity = arr.length;
        int sum_even = 0;
        System.out.println("Cac phan tu chan mang la: ");
        for (int i = 0; i < quantity; i++){
            if (arr[i] % 2 == 0){
                System.out.println(arr[i]);
                sum_even += arr[i];
            }
        }
        System.out.println("Tong phan tu chan mang la: " + sum_even);
    }
    static void cau_c(int []arr){
        int quantity = arr.length;
        int sum_odd = 0;
        System.out.println("Cac phan tu le mang la: ");
        for (int i = 0; i < quantity; i++){
            if (arr[i] % 2 != 0){
                System.out.println(arr[i]);
                sum_odd += arr[i];
            }
        }
        System.out.println("Tong phan tu chan mang la: " + sum_odd);
    }
    static void cau_d(int []arr){
        int quantity = arr.length;
        int sum_prime = 0;
        PrimeNumber check = new PrimeNumber();
        System.out.println("Cac phan tu nguyen to mang la: ");
        for (int i = 0; i < quantity; i++){
            if (check.checkPrime(arr[i])){
                System.out.println(arr[i]);
                sum_prime += arr[i];
            }
        }
        System.out.println("Tong phan tu nguyen to mang la: " + sum_prime);
    }
    static void cau_e(int []arr){
        int quantity = arr.length;
        int newQuantity = quantity + 1;
        Scanner numInput = new Scanner(System.in);
        int []newArr = new int[newQuantity];
        System.arraycopy(arr, 0, newArr, 0, quantity);
        System.out.println("Nhap so muon them: ");
        int num = numInput.nextInt();
        newArr[newQuantity - 1] = num;
        System.out.println("Mang sau khi them phan tu " + num + ": ");
        for (int i = 0; i < newQuantity; i++){
            System.out.println(newArr[i]);
        }
    }
    static void cau_f(int []arr){
        Scanner numInput = new Scanner(System.in);
        int quantity = arr.length;
        System.out.println("Nhap phan tu thu k ma ban muon xoa trong mang tu 1-" + arr.length + ": ");
        int num = numInput.nextInt();
        num--;
        for (int i = num; i < quantity; i++){
            arr[i] = arr[i + 1];
        }
        quantity--;
        System.out.println("Mang sau khi xoa la: ");
        for (int i = 0; i < quantity; i++){
            System.out.println(arr[i]);
        }
    }
    //ham kiem tra 1 so co ton tai trong mang khong
    static boolean checkIfExist(int []arr, int num){
        boolean result = false;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                result = true;
                break;
            }
        }
        return result;
    } 
    static void cau_g(int []arr){
        //int result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so x: ");
        int numInput = input.nextInt();
        if(checkIfExist(arr, numInput) == true){
            System.out.println("Vi tri cua " + numInput + " trong mang la: ");
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == numInput){
                    System.out.print((i + 1) + "   ");
                }
            }
        }
        else{
            System.out.println(numInput + " khong ton tai trong mang");
        }
    }
}
