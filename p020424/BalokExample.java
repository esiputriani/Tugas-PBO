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

public class BalokExample {
    public static void main(String[] args){
        int pjg,lbr,t,la;
        Scanner input = new Scanner(System.in);
        //balok --> kons 1
        System.out.println("---Balok 1---");
        Balok b1 = new Balok();
        System.out.print("Panjang = ");pjg = input.nextInt();
        b1.setPanjang(pjg);
        System.out.print("Lebar = ");lbr = input.nextInt();
        b1.setLebar(lbr);
        System.out.print("Tinggi = ");t = input.nextInt();
        b1.setTinggi(t);
        la = b1.hitungLuasAlas();
        b1.printBalok(la, b1.hitungLuasPermukaan(), b1.hitungVolume());
        
        //balok2 --> kons 2
         System.out.println("---Balok 2---");
         Balok b2 = new Balok(10);
         b2.setLebar(4);
         b2.setTinggi(5);
         b2.printBalok();
         b2.printBalok(b2.hitungLuasAlas(), b2.hitungLuasPermukaan(), b2.hitungVolume(b2.hitungLuasAlas()));
         
        //balok3 --> kons3
        System.out.println("---Balok 3---");
        System.out.print("Panjang = ");pjg = input.nextInt();
        System.out.print("Lebar = ");lbr = input.nextInt();
        System.out.print("Tinggi = ");t = input.nextInt();
        Balok b3 = new Balok(pjg,lbr,t);
        la = b3.hitungLuasAlas();
        b3.printBalok(la, b3.hitungLuasPermukaan(), b3.hitungVolume(la));
    }
    
}
