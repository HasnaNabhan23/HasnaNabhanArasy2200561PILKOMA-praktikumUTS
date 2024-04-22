/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_pbo;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
import java.util.*;
import java.io.*;
public class nomor3 {
    //sumDigit untuk menentukan penjumlahan digitnya 
    public static int sumDigits(long n){
        int hasil =0;
        long digit; //pembuatan var
        while(n != 0){ // n = 123, n = 12, n=1
            digit = n%10; //123 % 10 = sisanya 3, 1 % 10 =1
            n/=10; //123 /10 =12.3, n=12, 12/10=1.2, 1/10 = 0.1 n = 0
            hasil = hasil + (int) digit; //0 + 3 = 3, 3 + 2 = 5, 5 + 1 =6
        }
        return hasil;
    }

    public static void main(String[] args) {

        //deklarasi variabel
        Scanner keyboard = new Scanner(System.in);
        long angka, digit;
        int hasil=0;

        // input data
        System.out.print("masukan angka : ");
        angka = keyboard.nextLong(); //inputan angka
        System.out.print("Jumlah ");
        hasil = sumDigits(angka); //hasil akan menyimpan nilai 6
        while(angka !=0){ //n =0 kondisi false, digunakan utk mencetak 3 + 2 + 1  
            digit = angka % 10;
            angka /=10;
            if(digit != 0 ){
                System.out.print(digit);
                if(angka !=0){
                    System.out.print(" + ");
                }
            }else{
               
            }
        }
        System.out.println(" = "+ hasil); //6
    }
}
