/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301081005.p180524;

/**
 *
 * @author hp
 */
public class FaktorRecursif {
    
    public static int fpbrekursif(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return fpbrekursif(y, x % y);
        }
    }

    public static void main(String[] args) {
        int x = 14;
        int y = 7;
        System.out.println("FPB dari " + x + " dan " + y + " adalah " + fpbrekursif(x, y));
    }

    
}
