/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301081005.p260324;

/**
 *
 * @author hp
 */
public class StudentRecord {
    String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;
    
    public StudentRecord(){
        System.out.println("Student Constructor");
        studentCount++;
        
    }
    
    public StudentRecord(String temp){
        studentCount++;
        this.name = temp;
    }
    
    public StudentRecord(String name, String address){
        studentCount++;
        this.name = name;
        this.address = address;
    }
    
    public StudentRecord(double eGrade,double mGrade,double sGrade){
        studentCount++;
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade =sGrade;
    }
    public String getName(){
        System.out.println("Student: getName");
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public int getAge(){
        return age;
    } 
    public void setAge(int age){
        this.age=age;
    }
    public double getMathGrade(){
        return mathGrade;
    }
    public void setMathGrade(double mathGrade){
        this.mathGrade=mathGrade;
    }
    public double getEnglishGrade(){
        return englishGrade;
    }
    public void setEnglishGrade(double englishGrade){
        this.englishGrade=englishGrade;
    }
    public double getmathGrade(){
        return mathGrade;
    }
    public void setmathGrade(double mathGrade){
        this.mathGrade=mathGrade;
    }
    public double getScienceGrade(){
        return scienceGrade;
    }
    public void setScienceGrade(double ScienceGrade){
        this.scienceGrade = scienceGrade;
    }
    public double getAverage(){
        average=(mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }
    public static int getStudentCount(){
        return studentCount;
    }

    public void print(String temp){
        System.out.println("Name: "+ name);
        System.out.println("Address: "+ address);
        System.out.println("Age: "+ age);
        
    }
    public void print(double eGrade,double mGrade,double sGrade){
        
        System.out.println("Name: "+ name);
        System.out.println("MathGrade: "+ mGrade);
        System.out.println("EnglishGrade: "+ eGrade);
        System.out.println("ScienceGrade: "+ sGrade);
    }
   
    
}
