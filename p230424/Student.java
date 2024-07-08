/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301081005.p230424;

/**
 *
 * @author hp
 */
public class Student extends Person {
    public Student(){
        super();
        // super("ali", "Padang");
       
        super.name ="ali";
        super.address ="Padang";
        System.out.println("Student Constructor");
    }
    
    @Override
    public String getName(){
        System.out.println("Student: getName");
        return name;
    }
    
}
