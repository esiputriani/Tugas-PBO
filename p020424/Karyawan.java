/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301081005.p020424;

/**
 *
 * @author hp
 */

    public class Karyawan {
    private String namaKaryawan;
    private int NIP;
    private int masaKerja;
    private double gajiPokok = 2000000; // Gaji pokok sebesar 2 juta
    
    public Karyawan(){
        
    }

    // Konstruktor dengan parameter
    public Karyawan(String namaKaryawan, int NIP) {
        this.namaKaryawan = namaKaryawan;
        this.NIP = NIP;
        
    }
    public Karyawan(int masaKerja){
        this.masaKerja = masaKerja;
    }
    
    
    public String getNamaKaryawan(){
        return namaKaryawan;
    }
    
    public int getNIP(){
        return NIP;
    }
    
    public int getMasaKerja(){
        return masaKerja;
    }
    
    public double getGajiPokok(){
        return gajiPokok;
    }
    
    public void setNamaKaryawan(String namaKaryawan){
        this.namaKaryawan = namaKaryawan;
    }
    
    public void setNIP(int NIP){
        this.NIP = NIP;
    }
    
    public void setmasaKerja(int masaKerja){
        this.masaKerja = masaKerja;
    }
    
    public void setgajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    

    // Method untuk menghitung tunjangan
    double hitungTunjangan() {
        if (masaKerja <= 5) {
            return masaKerja * 300000; // Tunjangan sebesar masaKerja * 500rb
        } else {
            return masaKerja * 500000; // Jika masaKerja > 5 tahun, maka tunjangan tetap 5 juta
        }
    }

    // Method untuk menghitung gaji total
    public double hitungGajiTotal() {
        return gajiPokok + hitungTunjangan();
    }
    
    public void printKaryawan(double gajiPokok, double hitungTunjangan, double hitungGajiTotal ){
        System.out.println("gaji = " +gajiPokok);
        System.out.println("Tunjangan = " +hitungTunjangan);
        System.out.println("Gaji total = " +hitungGajiTotal);
        
    }

   
    
    
}

    

