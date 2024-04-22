/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_pbo;

/**
 *
 * @author ASUS
 */
public class nomor4 {
    public static void main(String[] args) {
        
        LimasSegiEmpat limasSegiEmpat1 = new LimasSegiEmpat();
        System.out.println("Luas alas :"+limasSegiEmpat1.luasAlas);
        System.out.println("Luas selubung limas :"+limasSegiEmpat1.luasSelubungLimas);
        System.out.println("Tinggi :"+limasSegiEmpat1.tinggi);
        System.out.println("Luas :"+limasSegiEmpat1.getLuas());
        System.out.println("Volume :"+limasSegiEmpat1.getVolume());
        System.out.println("");

        LimasSegiEmpat limasSegiEmpat2 = new LimasSegiEmpat(30,40,50);
        System.out.println("Luas alas :"+limasSegiEmpat2.luasAlas);
        System.out.println("Luas selubung limas :"+limasSegiEmpat2.luasSelubungLimas);
        System.out.println("Tinggi :"+limasSegiEmpat2.tinggi);
        System.out.println("Luas :"+limasSegiEmpat2.getLuas());
        System.out.println("Volume :"+limasSegiEmpat2.getVolume());
        System.out.println("");

        LimasSegiEmpat limasSegiEmpat3 = new LimasSegiEmpat(25,35,45);
        System.out.println("Luas alas :"+limasSegiEmpat3.luasAlas);
        System.out.println("Luas selubung limas :"+limasSegiEmpat3.luasSelubungLimas);
        System.out.println("Tinggi :"+limasSegiEmpat3.tinggi);
        System.out.println("Luas :"+limasSegiEmpat3.getLuas());
        System.out.println("Volume :"+limasSegiEmpat3.getVolume());
        System.out.println("");

    }
}
