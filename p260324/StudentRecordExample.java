/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301081005.p260324;

/**
 *
 * @author hp
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord student1 = new StudentRecord();
        student1.setName("ALI");
        student1.setAddress("Padang");
        student1.setAge (20);
        student1.setMathGrade(90);
        student1.setEnglishGrade (70);
        student1.setScienceGrade(80);
        ////
        System.out.println("Nama         :"+student1.getName());
        System.out.println("umur         :"+student1.getAge());
        System.out.println("alamat       :"+student1.getAddress());
        System.out.println("Matematika   :"+student1.getMathGrade());
        System.out.println("B.inggris    :"+student1.getEnglishGrade());
        System.out.println("IPA          :"+student1.getScienceGrade());
        System.out.println("Rata- rata   :"+student1.getAverage());
        
        ///contoh pemanggilan method overload
        System.out.println("==============================");
        student1.print(student1.getName());
        System.out.println("==============================");
        student1.print(student1.getEnglishGrade(), student1.getMathGrade(), student1.getScienceGrade());
        
        StudentRecord annaRecord =  new StudentRecord("anna");
        StudentRecord aliRecord =  new StudentRecord("ali","Padang");
        StudentRecord dausRecord =  new StudentRecord(90,80,90);
        
        annaRecord.print(annaRecord.getName());
        aliRecord.print(aliRecord.getName());
        dausRecord.print(dausRecord.getEnglishGrade(),
                dausRecord.getMathGrade(), dausRecord.getScienceGrade());
        
        System.out.println("Banyak siswa   :"+StudentRecord.getStudentCount());
    }
    public class CobaOverride extends StudentRecord {
@Override
public String getName(){
System.out.println("afril juga student loooh....");
return name;}
}
    
}
