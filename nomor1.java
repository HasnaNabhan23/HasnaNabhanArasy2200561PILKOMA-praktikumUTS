/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_pbo;

/**
 *
 * @author ASUS
 */
import java.util.*;
public class nomor1 {
    public static void main(String[] args) {
       
       // deklarasi variabel
        int min, max, range, nilaiRandom;
        String bulan;

        // input data
        max = 12;
        min = 1;
        range = max;

        //untuk menentukan nilai random dari 1 sampai 12
        nilaiRandom = (int)(Math.random() * range) + min;

        // proses
        if(nilaiRandom == 1){
            bulan = "Januari";
        }else if(nilaiRandom == 2){
            bulan = "Febuari";
        }else if(nilaiRandom == 3){
            bulan = "Maret";
        }else if(nilaiRandom == 4){
            bulan = "April";
        }else if(nilaiRandom == 5){
            bulan = "Mei";
        }else if(nilaiRandom == 6){
            bulan = "Juni";
        }else if(nilaiRandom == 7){
            bulan = "Juli";
        }else if(nilaiRandom == 8){
            bulan = "Agustus";
        }else if(nilaiRandom == 9){
            bulan = "September";
        }else if(nilaiRandom == 10){
            bulan = "Oktober";
        }else if(nilaiRandom == 11){
            bulan = "November";
        }else if(nilaiRandom == 12){
            bulan = "Desember";
        }else{
            bulan = "Tidak Ada";
        }

        // output
        System.out.println("hasil Menampilkan bulan secara random");
        System.out.println(nilaiRandom + " = "+bulan);  
        //menampilkan string dan variabel pke tanda "+"
    }    
}
