/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;
import java.util.StringTokenizer;
/**
 *
 * @author Dell
 */
public class Bai9 {
    public void run() throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi: ");
        String strInput = input.nextLine();
        System.out.println("Cau a: do dai chuoi vua nhap: " + cau_a(strInput));
        System.out.println("Cau b: " + removeSpace(strInput));
        System.out.println("Cau c:"); 
        countWords(strInput);
        System.out.println("Cau d: ");
        cau_d(strInput);
       //System.out.println(countWords(strInput));
        System.out.println("Cau e: ");
        cau_e(strInput);
        input.close();
    }
    //cau a xuat do dai chuoi vua nhap
    static int cau_a(String s){
        return s.length();
    }
    
    static String removeSpace(String s){
        s = s.trim();//xoa khoang cach dau va cuoi chuoi
        //xoa khong cach thua trong chuoi
        while(s.lastIndexOf("  ") != -1){
            s = s.replaceAll("  ", " ");
        }
        return s;
    }
    //counting the number of words in the string entered
    //print words counted line by line
    //cách 1
    static int countWords(String s){
        int counted = 0;
        char character;
        s = removeSpace(s);
        for(int i = 0; i < s.length(); i++){
            character = s.charAt(i);
            if(Character.isSpaceChar(character)){
                System.out.println();
                counted++;
            }
            else{
                System.out.print(character);
            }
        }
        System.out.print("\nSo tu trong chuoi la: ");
        return ++counted;
    }
    //cách 2
    static void printWords(String input) {
        
        StringTokenizer tokens = new StringTokenizer(input, " ");
        
        while (tokens.hasMoreTokens()) {
            String word = tokens.nextToken();
            System.out.println(word);
        }
    }
    //nhap so k
    //xuat k ki tu ben trai, k ki tu ben phai
    //nfsdkjrgbkjse
    static void cau_d(String s){
        s = removeSpace(s);
        Scanner userInput = new Scanner(System.in);
        System.out.print("Nhap so k: ");
        int k = userInput.nextInt();
        String strRight = null;
        String strLeft = null;
        for (int i = 0; i < s.length();i++)
        {
            strRight = s.substring(s.length()-k);
            strLeft = s.substring(0,k);
        }
        System.out.println("String right: " + strRight);
        System.out.println("String left: " + strLeft);
        userInput.close();
    }
    //Enter 2 numbers n and k
    //print n characters (in string entered) from position k
    //cách 1
    static void cau_E(String s){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so k: ");
        int k = input.nextInt();
        System.out.print("Nhap so n: ");
        int n = input.nextInt();
        int charNum = 0;
        char character;
        for(int i = k; i < s.length(); i++){
            character = s.charAt(i);
            System.out.print(character);
            charNum++;
            if(charNum == n){
                break;
            }
        }
        input.close();
    }
    //cách 2
    static void cau_e(String s){
        Scanner input = new Scanner(System.in);
        s = removeSpace(s);
        System.out.print("Nhap so k: ");
        int k = input.nextInt();
        System.out.print("Nhap so n: ");
        int n = input.nextInt();
        String a = "";
        for(int i = 0; i < s.length(); i++){
            a = s.substring(k,k+n);
        }
        System.out.println(a);
        input.close();
    }
}
