/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301081005.p020424;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class KaryawanExample {
    public static void main(String[] args) {
        String namaKaryawan;
        int NIP;
        int masaKerja;
        
        Scanner input = new Scanner(System.in);
        
        //karyawan 1--> kons 1
        System.out.println("--karyawan 1--");
        Karyawan k1 = new Karyawan();
        System.out.print("Nama Karyawan = ");namaKaryawan = input.nextLine();
        k1.setNamaKaryawan(namaKaryawan);
        System.out.print("NIP = "); NIP = input.nextInt();
        k1.setNIP(NIP);
        System.out.print("Masa Kerja = ");masaKerja = input.nextInt();
        k1.setmasaKerja(masaKerja);
        
        k1.printKaryawan(k1.getGajiPokok(), k1.hitungTunjangan(), k1.hitungGajiTotal());
        
        //karyawan 2--.kons 2
         System.out.println("---Karyawan 2---");
         Karyawan k2 = new Karyawan("Dewi", 160424);
         k2.setmasaKerja(5);
         //k2.printKaryawan();
         k2.printKaryawan(k2.getGajiPokok(), k2.hitungTunjangan(), k2.hitungGajiTotal());
         
         //karyawan3-->kons 3
        System.out.println("---Karyawan 3---");
        System.out.print("Nama Karyawan = "); namaKaryawan = input.nextLine();
        System.out.print("NIP = ");NIP = input.nextInt();
        System.out.print("Masa Kerja = ");masaKerja = input.nextInt();
        Karyawan k3 = new Karyawan(7);
        k3.printKaryawan(k3.getGajiPokok(), k3.hitungTunjangan(), k3.hitungGajiTotal());
         
         
                
        
        
        

        
    }
    
}
