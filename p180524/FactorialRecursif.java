/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301081005.p180524;

/**
 *
 * @author hp
 */
public class FactorialRecursif {
    static int factorial(int n) {
        if (n == 1) { /* The base case */
        return 1;
    }
        /* Recursive definition; Self-invocation */
    return factorial(n-1)*n;
    }
    public static void main(String args[]) {
        int n =4;
        //int n = Integer.parseInt(args[0]);
        System.out.println(factorial(n));
    }

    
}
