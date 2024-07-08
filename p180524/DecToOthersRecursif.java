/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301081005.p180524;

/**
 *
 * @author hp
 */
public class DecToOthersRecursif {
    static void printBase(int num, int base) {
 String digits = "0123456789abcdef";
 /* Recursive step*/
 if (num >= base) {
 printBase(num/base, base);
 }
 /* Base case: num < base */
 System.out.print(digits.charAt(num%base));
 }
 public static void main(String args[]) {
     int num = 3;
     int base = 2;
// int num = Integer.parseInt(args[0]);
// int base = Integer.parseInt(args[1]);
 printBase(num, base);
 }
    
}
