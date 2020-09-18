/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Dell
 */
public class PrimeNumber {
    public boolean checkPrime(int num){
        int flag = 0;
        if (num == 2) return true;
        if (num < 2) return false;
        for (int i = 2; i < num/2; i++){
            if (num % i == 0){
                flag++;
            }
        }
        return flag == 0;
    }
}
