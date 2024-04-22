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
public class nomor2 {
   public static void main(String[] args) {
        
        //Deklarasi variabel
        Scanner keyboard = new Scanner(System.in);
        float pilihan,jumlah, rata2, pembagi;
        int positif, negatif;
        
        //pilihan untuk pilih angka
        //pembagi untuk mengambil total angka yg diinputkan buat di rata"

        //input data
        jumlah = 0; //nilai awal 
        pembagi = 0;
        positif = 0;
        negatif = 0;
        System.out.print("Masukan bilangan integer, program akan berhenti jika memasukan nilai 0: ");
        
        // do while itu di jalankan dulu baru di cek di akhir, karena butuh input keyboard berulang
        do{
            pilihan = keyboard.nextInt(); //inputan keyboard, ex 4, 2
            System.out.print(" "); //setelah input 4 spasi
            jumlah = jumlah+pilihan; //0 +4 = jumlah 4, 4 + 2 = 6
            if(pilihan != 0 ){ //jika pil tdk sama dgn 0
                pembagi++; //pembagi = 0, 0 + 1 = 1
            }

            if(pilihan > 0 ){ //4 > 0 benar
                positif++; //0 + 1 = 1
            }else if(pilihan < 0){
                negatif++;
            }else{

            }

        }while(pilihan != 0 ); //pengecekannya  // 4 != 0 benar
        //rata" tdk akan dijalankan jika pengecekannya selalu benar, selama angka tidak 0 perulangan akan trs berjalan
        rata2 = jumlah/pembagi; //jumlah terakhir, 6/2 = 3

        System.out.println("jumlah bilangan positif adalah "+positif);
        System.out.println("jumlah bilangan negatif adalah "+negatif);
        System.out.println("Nilai total adalah "+jumlah);
        System.out.println("Nilai rata-rata adalah "+rata2);

    } 
}
