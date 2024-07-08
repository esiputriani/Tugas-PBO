/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301081005.p270424;

/**
 *
 * @author hp
 */
public class Circle extends Shape{
        private static double phi = 3.14;
        private int jari;
        public Circle(){
        }
        
        public int getJari(){
            return jari;
        }
        public void setJari (int jari){
            this.jari=jari;
         
        }
        public String getName(){
            return("Circle");
        }
        public float getArea(){
            return (float) (3.14*jari*jari);
        }
        
       public static void main(String[] args){
            Circle circle = new Circle();
            circle.setJari(4);
            System.out.println("Nama   : "+circle.getName());
            System.out.println("Luas   : "+circle.getArea());
        }
        
    }
    

