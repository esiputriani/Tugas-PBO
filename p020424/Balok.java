/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301081005.p020424;

/**
 *
 * @author hp
 */
public class Balok {
    private int pjg;
    private int lbr;
    private int t;
    
public Balok() {
    
}

public Balok(int pjg){
    this.pjg = pjg;
}

public Balok(int pjg, int lbr,int t){
    this.pjg = pjg;
    this.lbr = lbr;
    this.t = t;
}   

public int getPanjang(){
    return pjg;
}

public int getLebar(){
    return lbr;
}

public int getTinggi(){
    return t;
}

public void setPanjang(int pjg){
    this.pjg = pjg;
    
}

public void setLebar(int lbr){
    this.lbr = lbr;
    
}

public void setTinggi(int t){
    this.t = t;
    
}

public int hitungLuasAlas(){
    return pjg * lbr;
}

public int hitungLuasPermukaan(){
    int lp;
    lp=  2*(pjg*lbr)+(pjg*t)+(lbr*t);
    return lp;
}

public int hitungVolume(){
    int vol;
    vol = pjg*lbr*t;
    return vol;
}

public int hitungVolume(int la){
    return la*t;
}

public void printBalok(){
    System.out.println("Panjang = " +pjg);
    System.out.println("Lebar = " +lbr);
    System.out.println("Tingggi = " +t);
    
}

public void printBalok(int la, int lp, int vol){
    System.out.println("Luas Alas = " +la);
    System.out.println("Luas permukaan = " +lp);
    System.out.println("volume = " +vol);
}

}
